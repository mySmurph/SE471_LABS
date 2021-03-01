package PoolPattern;


public class ObjectPool implements ObjectPool_IF {

	private static Object lockObject;
	
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
		return this.maxInstances;
	}

	@Override
	public void setCapacity(int c) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object getObject() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object waitForObject() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void releaseObject() {
		// TODO Auto-generated method stub

	}
	private Object removeObject() {
		// TODO Auto-generated method stub
		return null;
	}
	private Object createObject() {
		return creator.create();
	}

}
