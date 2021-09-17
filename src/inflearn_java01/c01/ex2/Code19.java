package inflearn_java01.c01.ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code19 {

	public static void main(String[] args) {

		String[] name = new String[1000];
		String[] number = new String[1000];
		int n = 0;

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

		for (int i = 0; i < n; i++)
			System.out.println(name[i] + ": " + number[i]);

	}
}
