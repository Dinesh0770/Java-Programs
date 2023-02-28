package ar;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {

		int arr[] = { 9, 7, 3, 4, 5, 1, 2 };

		// with method
		// Arrays.asList(arr);
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			// System.out.println("sorting with method");
			System.out.print(arr[i] + "\t");

		}
		System.out.println();
		// without method
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {

					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}
			// System.out.println("sorting without method");
			System.out.println();
			System.out.print(arr[i] + "\t");
		}

	}

}
