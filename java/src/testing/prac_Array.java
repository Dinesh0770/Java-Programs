package testing;

import java.util.*;

public class prac_Array {

	static void disp() {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter rows");
		int m = sc.nextInt();

		System.out.println("enter cols");
		int n = sc.nextInt();

		int[][] arr = new int[m][n];

		for (int i = 0; i < m; i++) {

			for (int j = 0; j < n; j++) {

				System.out.println("enter values ");

				arr[i][j] = sc.nextInt();

			}

		}

		for (int i = 0; i < m; i++) {

			for (int j = 0; j < n; j++) {

				System.out.print(arr[i][j] + "\t" + "|" + "\t");

			}
			System.out.println("");
		}
		sc.close();

	}

	public static void main(String[] args) {
//
//		prac_Array ob=new prac_Array();
//		
//		ob.disp();
		prac_Array.disp();
	}

}
