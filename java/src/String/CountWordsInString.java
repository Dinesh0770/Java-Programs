package String;

public class CountWordsInString {

	public static void main(String[] args) {

		String str = "welcome to java programming";

		int count = 1;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {

				count++;

			}

		}
		System.out.println("count words present in string :" + count);
	}

}
