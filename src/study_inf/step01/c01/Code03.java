package study_inf.step01.c01;

import java.util.*;

public class Code03 {

	public static void main(String[] args) {

		String str = "Hello";

		String input = null;

		Scanner kb = new Scanner(System.in);

		System.out.println("Plese type a string: ");
		input = kb.next();

		if (str.equals(input)) {    // Not (str == input) String이여서
			System.out.println("Strings match! :-)");
		} else {
			System.out.println("Strings do not match! :1(");
		}

		kb.close();
	}
}
