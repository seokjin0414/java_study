package inflearn_java01.c01.ex1;

import java.util.*;

public class Code02 {
	
	public static void main(String[] args) {
		
		int number = 123;
		
		Scanner kb = new Scanner(System.in );
		
		System.out.println("Please enter an integer: ");
		
		int input = kb.nextInt();
		
		if(input == number) {
			System.out.println("Numbers match! :-)");
		} else {
			System.out.println("Numbers do not match! :-(");
		}
		kb.close();
	}
	
}
