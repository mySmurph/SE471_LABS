package Vehicle;

public class TourBus extends Bus {
	
	private int bed_count;
	private float storage_capacity;

	public TourBus(String maker, String model, int year, String VIN, String PlateNO, int bed_count, float storage_capacity) {
		super(maker, model, year, VIN, PlateNO);
		this.setBed_count(bed_count);
		this.setStorage_capacity(storage_capacity);
	}



	/**
	 * @return the storage_capacity
	 */
	public float getStorage_capacity() {
		return storage_capacity;
	}

	/**
	 * @param storage_capacity the storage_capacity to set
	 */
	public void setStorage_capacity(float storage_capacity) {
		this.storage_capacity = storage_capacity;
	}


	/**
	 * @return the bed_count
	 */
	public int getBed_count() {
		return bed_count;
	}



	/**
	 * @param bed_count the bed_count to set
	 */
	public void setBed_count(int bed_count) {
		this.bed_count = bed_count;
	}

}
