package collectionlist;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {

		ArrayList a = new ArrayList();

		a.add(10);
		a.add(120);
		a.add(104);
		a.add(102);
		a.add(106);

		System.out.println(a);

		for (Object a1 : a) {

			System.out.println(a1);

		}

		ArrayList<String> a1 = new ArrayList<String>();

		a1.add("abc");
		// a1.add(09);
		System.out.println(a1);

		ArrayList a2 = new ArrayList();

	}
}
