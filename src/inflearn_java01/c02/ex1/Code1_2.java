package inflearn_java01.c02.ex1;

public class Code1_2 {
	
	public static void main(String[] args) {

		Person1 first;
		first = new Person1(); // object

		first.name = "John";
		first.number = "01012345678";

		Person1 second = first;
		second.name = "Tom";
		
		System.out.println(first.name + "," + first.number);
		
		Person1[] members = new Person1[100];
		members[0] = first;
		members[1] = second;
		System.out.println("Second is " + members[0].name + " wiht number " + members[0].number);
		System.out.println("Second is " + members[1].name + " wiht number " + members[1].number);
		
		members[2] = new Person1();
		members[2].name ="David"; 
		members[2].number ="01066663333"; 
		
		System.out.println(members[2].name + members[2].number);
	}
}