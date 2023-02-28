package abstraction;

abstract class demo1 {

	abstract void demo();

	void dis() {

		System.out.println("abstract method in parent class");
	}
}

class demo2 extends demo1 {

	void demo() {
		System.out.println("abstract method implement in child class");
	}

	void dis() {
		System.out.println("display method in child class");
	}

}

public class demo {

	public static void main(String[] args) {

		demo2 d = new demo2();

		d.demo();
		d.dis();

	}

}
