package inflearn_java01.c02.ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code9 {

	static MyRectangle2[] rects = new MyRectangle2[100];
	static int n = 0;

	public static void main(String[] args) {
		// rects = new MyRectangle1[100];
		try {
			Scanner in = new Scanner(new File("data.txt"));
			while (in.hasNext())
				rects[n++] = new MyRectangle2(in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt());
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println("No data file.");
			System.exit(1);
		}

		bubbleSort();

		for (int i = 0; i < n; i++)
			System.out.println(rects[i].toString());
	}

	private static void bubbleSort() {
		for (int i = n - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (rects[j].calcArea() > (rects[j + 1]).calcArea()) {
					MyRectangle2 tmp = rects[j + 1];
					rects[j] = rects[j + 1];
					rects[j + 1] = tmp;
				}
			}
		}
	}

}
