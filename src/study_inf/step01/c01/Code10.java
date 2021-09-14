package study_inf.step01.c01;

import java.util.Scanner;

public class Code10 {
	public static void main(String[] args) {

		System.out.println("Start");

		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] data = new int[n];

		for (int i = 0; i < n; i++)
			data[i] = kb.nextInt();
		kb.close();

		int max = 0;
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = i; j < n; j++) {
				sum += data[j];
				if (sum > max)
					max = sum;

				/*
				 * 개선전 
				 * int max = 0;
				 * for (int i = 0; i < n; i++) { 
				 * 	for (int j = i; j < n; j++) {
				 * 		int sum = 0; 
				 * 		for (int k = i; k <= j; k++) 
				 * 			sum += data[k]; 
				 * 		if (sum > max) 
				 * 			max= sum; 
				 * // add data[i] ... data[i] 
				 * // if the sum > max 
				 * // max = the sum;
				 */
			}
		}

		System.out.println(max);
	}
}
