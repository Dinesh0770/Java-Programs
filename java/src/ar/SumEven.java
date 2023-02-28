package ar;

public class SumEven {

	public static void main(String[] args) {
		int arr[] = { 12, 43, 12, 11, 9, 7, 5 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 0) {
				sum = sum + arr[i];

			}

		}
		System.out.println("sum of even no =" + sum);
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 != 0) {
				sum = sum + arr[i];

			}

		}
		System.out.println("sum of odd no =" + sum);

	}

}
