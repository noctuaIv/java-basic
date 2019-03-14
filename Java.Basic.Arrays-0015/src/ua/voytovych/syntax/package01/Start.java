package ua.voytovych.syntax.package01;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Start {

	public static void main(String[] args) {

		// int [] array = new int[10];
		Integer[] array = new Integer[10];

		Random random = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(100);
		}

		int[][] table1 = new int[3][5];

		int[][] table2 = new int[][] { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };// двохвимірний
																										// заповнений
																										// масив

		System.out.println("table2.length = " + table2.length);

		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 4; j++) {
				System.out.println(table2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		// table2[1][3] = 0;

		showTriangle();

		// Arrays.sort(array);
		//
		// for (int i = 0; i < array.length; i++) {
		// System.out.println(array[i] + " ");
		// }
		Arrays.sort(array, Collections.reverseOrder());

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}

	}

	private static void showTriangle() {
		char[][] triangleArray = new char[10][];
		triangleArray[0] = new char[1];
		triangleArray[1] = new char[2];
		triangleArray[2] = new char[3];
		triangleArray[3] = new char[4];
		triangleArray[4] = new char[5];
		triangleArray[5] = new char[6];
		triangleArray[6] = new char[7];
		triangleArray[7] = new char[8];
		triangleArray[8] = new char[9];
		triangleArray[9] = new char[10];

		for (int i = 0; i < triangleArray.length; i++) {
			for (int j = 0; j < triangleArray[i].length; j++) {
				triangleArray[i][j] = '*';
			}
		}

		for (int i = 0; i < triangleArray.length; i++) {
			for (int j = 0; j < triangleArray[i].length; j++) {
				System.out.print(triangleArray[i][j]);
			}
			System.out.println();
		}

	}

}
