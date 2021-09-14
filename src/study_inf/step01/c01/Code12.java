package study_inf.step01.c01;

import java.util.*;

public class Code12 {

	public static void main(String[] args) {
		
		System.out.println("Start");
		
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] data = new int[n];

		for (int i = 0; i < n; i++)
			data[i] = kb.nextInt();
		kb.close();
		// bubblesort 알고리즘
		for (int i = n - 1; i > 0; i--) {
			// data[0] .. data[i]
			for (int j = 0; j < i; j++) {
				if (data[j] > data[j + 1]) {
					// swap data[j] and data[j+1]
					int tmp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = tmp;
				}
			}

		}

		System.out.println("Sorted data");
		for (int i = 0; i < n; i++)
			System.out.println(data[i]);
	}
}
