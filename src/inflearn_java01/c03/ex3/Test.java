package inflearn_java01.c03.ex3;

public class Test { // subClass of Object
	public int a;
	public double x;

	public String toString() {
		return a + " " + x;
	}

	public boolean equals(Object other) { // overriding
		Test other2 = (Test) other; // type ca sting
		return a == other2.a && x == other2.x;
	}

	public static void main(String[] args) {
//		Test test1 = new Test();
//		Test test2 = new Test();
//	    test2.a =5;
//		test2.x =1.29384792;

//		System.out.println(test1.toString());

//		if (test2.equals(test2))
//			System.out.println("yes");
//		else
//			System.out.println("no");

		Object[] array = new Object[100];
		int a = 20; 
//		Integer age = new Integer(a); // wrapping
//		array[0] = age;
//		int b = age.intValue(); // unwapping
		
		array[0] =a; // auto boxing
		int b = (Integer)array[0]; // auto unboxing, unwapping

		System.out.println(b);

		String str = "1234";
		int c = Integer.parseInt(str);
		System.out.println(c);

	}

}
