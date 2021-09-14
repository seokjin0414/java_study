package study_inf.step01.c01;

import java.util.*;

public class Code04 {

	public static void main(String[] args) {

		String name = null;
		int age;
		String gender;

		Scanner kb = new Scanner(System.in);

		System.out.println("Plese type your name and age and gender: ");

		name = kb.next();
		age = kb.nextInt();
		gender = kb.next();

		if (gender.equals("male"))   // string literal
			System.out.println(name + ", you're " + age + " years old man.");
		else if (gender.equals("female"))
			System.out.println(name + ", you're " + age + " years old woman. ");
		else
			System.out.println("Hmm... interesting.");
		kb.close();
	}
}
