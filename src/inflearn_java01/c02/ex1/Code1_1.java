package inflearn_java01.c02.ex1;

public class Code1_1 {

	public static void main(String[] args) {

		Person1 first;
		first = new Person1(); // object

		first.name = "John";
		first.number = "01012345678";

		System.out.println("Name: " + first.name + ", Number: " + first.number);

		Person1[] members = new Person1[100];
		members[0] = first;
		members[1] = new Person1();
		members[1].name = "David";
		members[1].number = "01098765432";

		System.out.println("Second is " + members[1].name + " wiht number " + members[1].number);
	}
}
