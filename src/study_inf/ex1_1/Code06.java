package study_inf.ex1_1;

import java.util.*;

public class Code06 {

	public static void main(String[] args) {

		System.out.println("start");
		
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] data = new int[n];
		for (int i = 0; i < n; i++)
			data[i] = kb.nextInt();
		kb.close();

		int sum = 0;
		int max = data[0];
		for (int i = 0; i < n; i++) {
			sum += data[i]; // sum = snm + data[1];
			if (data[i] > max)
				max = data[i];
		}

		System.out.println("The sum is " + sum);
		System.out.println("The max is " + max);
	}
}
