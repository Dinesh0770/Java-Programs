package prac;

import java.util.*;

public class ReverString {

	public static void main(String[] args) {

		int n=1;
		while(n!=0) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("\nenter string");

		String name = sc.next();
		String rev = "";
		int d = name.length();
		for (int i = d - 1; i >= 0; i--) {

			rev = rev + name.charAt(i);
		}

		System.out.println("original string :"+name+"  "+"\nreverse string :"+rev);
		n++;
		}
	}

}
