package ar;

import java.util.Scanner;

public class a {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter rows");
		int r = sc.nextInt();

		System.out.println("enter cols");
		int c = sc.nextInt();

		int arr[][] = new int[r][c];

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				arr[r][c] = sc.nextInt();

			}

		}

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[r][c]);

			}
		}

	}

}
