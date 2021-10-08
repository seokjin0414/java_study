package inflearn_java01.c03.ex1;

public class Notebook extends Computer {

	public double screenSize;
	public double weight;

	public Notebook(String man, String proc, int ram, int disk, double speed, double screen, double weight) {
		super(man, proc, ram, disk, speed);
		screenSize = screen;
		this.weight = weight;
	}
	
	public String toString() {
		String result = super.toString() +
				        "\nScreen Size: " + screenSize + " inches" +
				        "\nWeight: " + weight + " kg";
		return result;
	}

	public static void main(String[] args) {
		Computer test = new Notebook("Dell", "i5", 4, 1000, 3.2, 15.6, 1.2); // 다형성
//		Notebook test = new Computer("Dell", "i5", 4, 1000, 3.2, 15.6, 1.2); // 성립불가
		
//		test.manufacturer = "Dell";
//		test.processor = "i5";
//		test.ramSize = 4;
//		test.diskSize = 1000;
//		test.processorSpeed = 3.2;

//		test.screenSize = 15.6;
//		test.weight = 1.2;

//		System.out.println(test.computePower()); 
		System.out.println(test.toString()); //static binding  vs  dynamic binding (java) 
		
	}

}
