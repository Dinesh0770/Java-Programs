package Constructor;

class my {

	 static void r() {
		 System.out.println("static");
	 }
	 
	void g() {

		System.out.println("hello 1");
	}

}

class my1 extends my {

	void g1() {
		System.out.println("hello 2");
	}

}

public class Con1 {

	// no parameter constructor
	Con1() {

		System.out.println("welcome");
	}

	// with parameter constructor
	// ex 1
	Con1(int no, String name) {

//		System.out.println("hello");
		System.out.println(no);
		System.out.println();
		System.out.println(name);
	}

	// with parameter constructor
//ex 2
	Con1(String i) {
		System.out.println();
		System.out.println(i);
	}

	public static void main(String[] args) {

		Con1 c = new Con1(4, "hello");

		Con1 c1 = new Con1();

		Con1 c2 = new Con1("bye");

		// extend classes methods calling by object
		my1 b = new my1();

	
		b.g();
		b.g1();
	}

}
