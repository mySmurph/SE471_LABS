package PoolPattern;


public class ObjectPool implements ObjectPool_IF {

	private static Object lockObject = new Object();
	
	/**
	 * the number of free objects
	 */
	private int size;
	
	/**
	 * the number of objects that have been created
	 */
	private int instanceCount;
	
	/**
	 * the maximum number of objects that may be created
	 */
	private int maxInstances;
	
	/**
	 * the pool of objects
	 */
	private Object[] pool;
	
	/**
	 * singleton ObjectPool
	 */
	private static ObjectPool poolInstance = null;
	
	/**
	 * the Object creator 
	 */
	private ObjectCreation_IF creator;
	
	private ObjectPool(ObjectCreation_IF c, int max) {
		this.creator = c;
		this.maxInstances = max;
		this.size = 0;
		this.instanceCount = 0;
		this.pool  = new Object[maxInstances];
	}

	public static ObjectPool getPoolInstance(ObjectCreation_IF c, int max) {
		
		synchronized(lockObject){
			if(poolInstance == null) {
				poolInstance = new ObjectPool(c, max);
			}
		}
		return poolInstance;
		
	}
	@Override
	public int getSize() {
		return this.size;
	}

	@Override
	public int getCapacity() {
		return pool.length;
	}
	
	/**
	 * copied from book P.172
	 */
	@Override
	public void setCapacity(int c) {
		if(c != pool.length) {
			if(c <= 0) {
				String msg = "Capacity must be greater than zero.\n\tValue Entered:\t" + c;
				throw new IllegalArgumentException(msg);
			}
			synchronized(lockObject){
				this.maxInstances = c;
				Object[] newPool = new Object[maxInstances];
				System.arraycopy(pool, 0, newPool, 0, maxInstances);
				pool = newPool;
			}
		}
	}

	/**
	 * copied from book P.172
	 */
	@Override
	public Object getObject() {
		synchronized(lockObject){
			if(size > 0) {
				return removeObject();
			}else if(instanceCount < maxInstances) {
				return createObject();
			}else {
				return null;
			}
		}
	}

	/**
	 * copied from book P.173
	 */
	@Override
	public Object waitForObject() throws InterruptedException{
		synchronized(lockObject){
			if(size > 0) {
				return removeObject();
			}else if(instanceCount < maxInstances) {
				return createObject();
			}else {
				do {
					lockObject.wait();
				}while(size <= 0);
				return removeObject();
			}
		}
	}

	/**
	 * copied from book P.173-174
	 */
	@Override
	public void release(Object o) {
		if(o == null) {
			throw new NullPointerException();
		}
		synchronized(lockObject){
			if(size < getCapacity()) {
				pool[size] = o;
				size++;
				lockObject.notify();
			}
		}

	}
	
	/**
	 * copied from book P.173
	 */
	private Object removeObject() {
		size--;
		return pool[size];
	}
	private Object createObject() {
		instanceCount++;
		return creator.create();
		
	}

}
