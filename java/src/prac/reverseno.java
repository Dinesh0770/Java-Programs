package prac;

import java.util.Scanner;

public class reverseno {

	public static void main(String[] args) {

		System.out.println("enter no :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rev = 0;

		while (n != 0) {

			int rem = n % 10;

			rev = (rev * 10) + rem;

			n = n / 10;

		}
		System.out.print("" + rev);

	}
}
