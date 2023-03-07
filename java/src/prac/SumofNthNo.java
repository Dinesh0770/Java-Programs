package prac;

import java.util.Scanner;

public class SumofNthNo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter no");
		int n = sc.nextInt();

		int even = 0, odd = 0;

		for (int i = 1; i <= n; i++) {

			if (i % 2 == 0) {

				even = even + i;
				System.out.println(i + "\t" + "even");

			} else if (i % 2 != 0) {

				odd = odd + i;
				System.out.println(i + "\t" + "odd");
			}

		}

		System.out.println("\neven no" + even);
		System.out.println("\noddno" + odd);
	}

}
