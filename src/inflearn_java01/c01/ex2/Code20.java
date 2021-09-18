package inflearn_java01.c01.ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code20 {

	static String[] name = new String[1000];
	static String[] number = new String[1000];
	static int n = 0;

	public static void main(String[] args) {

		try {
			Scanner inFile = new Scanner(new File("input.txt"));
			while (inFile.hasNext()) { // detect End of File
				name[n] = inFile.next();
				number[n] = inFile.next();
				n++;
			}

			inFile.close();
		} catch (FileNotFoundException e) {
			System.out.println("No File");
			System.exit(9);
		}

		bubbleSort();

		for (int i = 0; i < n; i++)
			System.out.println(name[i] + ": " + number[i]);
	}

	static void bubbleSort() {
		for (int i = n - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (name[j].compareToIgnoreCase(name[j + 1]) > 0) { // compareTo 1,0,-1
					// swap name[j] and name[j+1]
					String tmp = name[j];
					name[j] = name[j + 1];
					name[j + 1] = tmp;

					tmp = number[j];
					number[j] = number[j + 1];
					number[j + 1] = tmp;

				}
			}
		}
	}
}
