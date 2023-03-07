package prac;

public class AllPrograms {

	void reverseno() {

		int no = 1234;
		int rev = 0;

		while (no != 0) {

			int rem = no % 10;

			rev = rev * 10 + rem;

			no = no / 10;

		}

		System.out.println(rev);

		System.out.println();

	}

	void stringbuff() {

		String str = "welcomejav";
		StringBuffer s = new StringBuffer(str);

		s.reverse();
		System.out.println(s);

	}

	void reversestring() {

		String str = "welcome";
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			rev = rev + str.charAt(i);

		}

		System.out.println(rev);

	}

	void revstring() {
		String str = "welcome to java";
		String rev = "";

		String arr[] = str.split(" ");

		for (int i = 0; i < arr.length; i++) {

			String temp = arr[i];

			for (int j = temp.length() - 1; j >= 0; j--) {

				rev = rev + temp.charAt(j);

			}
			rev = rev + " ";
		}
		System.out.println(rev);
	}

	void arrsort() {

		int arr[] = { 9, 8, 7, 6, 5, 4, 3, 2 };
		int temp = 0;

//		Arrays.sort(arr);
//
//		for (int i = 0; i <= arr.length; i++) {
//
//			System.out.println(arr[i]);
//		}
//
//		System.out.println();

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {

					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}
			System.out.println(arr[i]);

		}
	}

	void sumevenoddArr() {

		int arr[] = { 9, 8, 7, 6, 5, 4, 3, 2 };
		int odd = 0;
		int even = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 0) {

				even = even + arr[i];

			}

			else if (arr[i] % 2 != 0) {

				odd = odd + arr[i];

			}

		}

		System.out.println(even + " " + odd);

	}

	void pairsumArr() {

		int arr[] = { 1, 2, 3, 4, 5, 6 };

		int sum = 7;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] + arr[j] == sum) {

					System.out.println(arr[i] + "+" + arr[j] + "=" + sum);

				}
			}

		}

	}

	void prime() {

		int n = 11;
		int temp = 0;

		for (int i = 2; i < n; i++) {

			if (i % 2 == 0) {

				temp = temp + 1;

			}
		}

		if (temp == 0) {
			System.out.println("not prime");
		} else {

			System.out.println("prime");
		}

	}

	public static void main(String[] args) {

		AllPrograms a = new AllPrograms();

		// a.reverseno();
		// a.reversestring();

		// a.revstring();

		// a.arrsort();
		// a.stringbuff();

		// a.sumevenoddArr();
		a.pairsumArr();

		// a.prime();

	}

}
