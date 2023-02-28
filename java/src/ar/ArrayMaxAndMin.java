package ar;

public class ArrayMaxAndMin {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 60, 70 };

		int max = arr[0];
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (max < arr[i]) {
				max = arr[i];
			} else if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("array of max =" + max + "\n" + "array of min =" + min);
	}

}
