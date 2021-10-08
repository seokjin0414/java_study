package inflearn_java01.c03.ex1;

public class Computer {

	private String manufacturer;
	private String processor;
	private int ramSize;
	private int diskSize;
	private double processorSpeed;

	public Computer(String man, String proc, int ram, int disk, double procSpeed) {
		manufacturer = man;
		processor = proc;
		ramSize = ram;
		diskSize = disk;
		processorSpeed = procSpeed;
	}

	public double computePower() {
		return ramSize * processorSpeed;
	}

	public double getRamSize() {
		return ramSize;
	}

	public double getProcessorSpeed() {
		return processorSpeed;
	}

	public int getDiskSize() {
		return diskSize;
	}

	public String toString() {
		String result = "Manufacturer: " + manufacturer + 
				        "\nCpu: " + processor + 
				        "\nRam: " + ramSize + " magabytes" +
				        "\nDisk: " + diskSize + " gigabytes" + 
				        "\nProcessor speed: " + processorSpeed + "gigahertz";
		return result;
	}

}
