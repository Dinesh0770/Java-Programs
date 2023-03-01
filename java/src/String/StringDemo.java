package String;

public class StringDemo {

	public static void main(String[] args) {

		String str = "welcome to java";

		String str1 = new String("WElcome to programming");

		// methods
		// length() >> int

		int len = str.length();
		System.out.println(str1.length());
		System.out.println(len);

		System.out.println();

		System.out.println("\nindexof");
		// indexOf("char") > int
		System.out.println(str.indexOf("w"));//
		System.out.println(str1.indexOf("p"));//
		System.out.println(str.indexOf("j"));

		System.out.println(str.indexOf("z"));// -1 when character is not present

		System.out.println(str1.indexOf("o"));// first occurred char

		System.out.println();
		System.out.println("\nlastindexof");
		// lastIndexOf("char") >int lastindex

		System.out.println(str1.lastIndexOf("i"));
		System.out.println(str.lastIndexOf("o"));

		System.out.println();
		System.out.println("\nindex no");
		// charAt(int index) >> char

		System.out.println(str1.charAt(0));
		System.out.println(str.charAt(6));

		// System.out.println(str1.charAt(30));// exception
		System.out.println("\nuppercase ");
		// toUpperCase(String) > String

		System.out.println(str1.toUpperCase());
		System.out.println(str.toUpperCase());
		System.out.println("\nlowercase");
		// toLowerCase(String) > String

		System.out.println(str1.toLowerCase());
		System.out.println(str.toLowerCase());

		System.out.println("\ncontains element");
		// contains("char/string") > boolean

		System.out.println(str.contains(str1));// true
		// System.out.println(str.contains(str3));
		System.out.println(str.contains("T"));// true
		System.out.println("\nconcat");
		// concat(Sting) > String

		System.out.println(str1.concat(str));

		System.out.println("\nequal with ignorecase");
		// equalsIgnoreCase(String) > bolean

		System.out.println(str1.equalsIgnoreCase(str));// true

		// System.out.println(str1.equalsIgnoreCase(str4));// false
		System.out.println("\nempty string");
		// isEmpty() > boolean

		System.out.println(str1.isEmpty());
		System.out.println(str.isEmpty());

		System.out.println("\nreplace char or string");
		// replace (oldchar, newchar)

		System.out.println(str.replace("w", "p"));

		System.out.println(str1.replaceAll("m", " "));
		System.out.println("\ntrim the spaces");
		// trim() > String

		String str6 = "    Java  ";

		System.out.println(str6);
		System.out.println(str6.trim());

		System.out.println();
		System.out.println("\nspilt");
		// split(String pattern) > String[]

		String[] allWords = str.split("e");

		for (int i = 0; i < allWords.length; i++) {
			System.out.println(allWords[i]);
		}

		System.out.println();
		System.out.println("\nsubstring");
		System.out.println(str1.substring(2));
		System.out.println(str.substring(3, 9));

	}

}
