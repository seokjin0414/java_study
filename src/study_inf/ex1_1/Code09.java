package study_inf.ex1_1;

import java.util.*;

public class Code09 {
	public static void main(String[] args) {

		System.out.println("Start");
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] data = new int[n];

		for (int i = 0; i < n; i++)
			data[i] = kb.nextInt();
		kb.close();

		int count = 0;
		for (int i = 0; i < n; i++) {         // i < j
			for (int j = i + 1; j < n; j++) {
				if (data[i] == data[j])
					count++;
			}
		}
		System.out.println(count);
	}
}
