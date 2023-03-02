package String;

public class StringReverse2 {

	public static void main(String[] args) {

		String str = "welcome to java programming";

		String rev = " ";

		String[] str1 = str.split(" ");

		for (int i = 0; i < str1.length - 1; i++) {

			String temp = str1[i];

			for (int j = temp.length() - 1; j >= 0; j--) {

				rev = rev + temp.charAt(j);

			}
			rev = rev + " ";
		}
		System.out.println("original string : " + str);
		System.out.println("reverse string : " + rev);

	}

}
