package PoolPattern;


public class ObjectPool implements ObjectPool_IF {

	private Object lockObject;
	
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
	 * 
	 */
	public ObjectPool(ObjectCreation_IF c, int max) {
		this.maxInstances = max;
		this.pool  = new Object[maxInstances];
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getCapacity() {
		// TODO Auto-generated method stub
		return 0;
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

}
