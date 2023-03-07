package ar;

public class TwoDimAray {

	public static void main(String[] args) {

		int arr[][] = new int[2][3];

		arr[0][0] = 122;
		arr[0][1] = 121;
		arr[0][2] = 123;

		arr[1][0] = 212;
		arr[1][1] = 212;
		arr[1][2] = 212;

		for (int i = 0; i <= arr.length; i++) {

			for (int j = 0; j <= arr.length; j++) {

				System.out.print(arr[i][j] + "\t");

			}
			System.out.println();
		}

	}

}
