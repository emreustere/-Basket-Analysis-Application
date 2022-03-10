package main;

public class PC extends Electronic {

	private int ramCapacity;
	private int ssdCapacity;
	private String cpu;

	public PC(int ramCapacity, int ssdCapacity, String cpu) {
		super();
		productAbbrv = productAbbrv + "PC";
		this.ramCapacity = ramCapacity;
		this.ssdCapacity = ssdCapacity;
		this.cpu = cpu;
	}

	/**
	 * @return the ramCapacity
	 */
	public int getRamCapacity() {
		return ramCapacity;
	}

	/**
	 * @return the ssdCapacity
	 */
	public int getSsdCapacity() {
		return ssdCapacity;
	}

	/**
	 * @return the cpu
	 */
	public String getCpu() {
		return cpu;
	}	
	
}
