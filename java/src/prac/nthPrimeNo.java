package prac;

import java.util.Scanner;

public class nthPrimeNo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter no");

		int n = sc.nextInt();

		for (int i = 0; i <= n; i++) {
			int temp = 0;

			for (int j = 2; j < i; j++) {

				if (i % j == 0) {

					temp = temp + 1;

				}

			}
			if (temp == 0) {
				System.out.print(i + ",");

			} else {
				temp = 0;
			}

		}

	}

}
