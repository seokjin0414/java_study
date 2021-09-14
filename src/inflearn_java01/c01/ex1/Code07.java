package inflearn_java01.c01.ex1;

import java.util.Scanner;

public class Code07 {

	public static void main(String[] args) {

		System.out.println("Start");

		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();

		int[] data = new int[n];

		for (int i = 0; i < n; i++)
			data[i] = kb.nextInt();
		kb.close();

		int tmp = data[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			data[i + 1] = data[i];
		}
		data[0] = tmp;

		for (int i = 0; i < n; i++)
			System.out.println(data[i]);
	}
}
