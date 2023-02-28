package testing;

import java.util.Scanner;

class my{
	void get() {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("id");
		int id=sc.nextInt();
		System.out.println("name");
		String name=sc.next();
		System.out.println("id is"+id);
		System.out.println("name is"+name);
		sc.close();
	}
}

class my1 extends my{
	
	void set() {
	
	}
	
}
public class testing_1 {

	public static void main(String[] args) {
	System.out.println("hello");

	System.out.println("");
	
	my1 d=new my1();
	
	d.get();


	}

}
