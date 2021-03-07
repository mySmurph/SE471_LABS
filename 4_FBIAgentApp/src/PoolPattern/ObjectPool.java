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
	
	/**
	 * counts all the tasks
	 */
	private int taskCounter = 0;
	
	/**
	 * constructor
	 * @param c
	 * @param max
	 */
	private ObjectPool(ObjectCreation_IF c, int max) {
		this.creator = c;
		this.maxInstances = max;
		this.size = 0;
		this.instanceCount = 0;
		this.pool  = new Object[maxInstances];
	}

	/**
	 * get a object pool
	 * @param c
	 * @param max
	 * @return the instance of the ObjectPool
	 */
	public static ObjectPool getPoolInstance(ObjectCreation_IF c, int max) {
		
		synchronized(lockObject){
			if(poolInstance == null) {
				poolInstance = new ObjectPool(c, max);
			}
		}
		return poolInstance;
		
	}
	
	/**
	 * @return size - the number of free objects
	 */
	@Override
	public int getSize() {
		return this.size;
	}

	/**
	 * @return capacity - the total number of objects 
	 */
	@Override
	public int getCapacity() {
		return pool.length;
	}
	
	/**
	 * set the total number of objects that make up the object pool
	 * @param c the new capacity
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
	 * get an object from the object pool
	 * @return the object
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
	 * get an object from the object pool when it becomes available
	 * @return the object
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
	 * return an object to the object pool
	 * @param o - the object to be placed back in the object pool
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
	 * remove an object from the object pool
	 * @return the object that has been removed
	 * copied from book P.173
	 */
	private Object removeObject() {
		size--;
		return pool[size];
	}
	
	/**
	 * make a new object
	 * @return the new object
	 */
	private Object createObject() {
		instanceCount++;
		return creator.create();
	}

	/**
	 * get the next task number
	 * @return the next task number
	 */
	@Override
	public int getNextTask() {
		return ++taskCounter;
	}

}
