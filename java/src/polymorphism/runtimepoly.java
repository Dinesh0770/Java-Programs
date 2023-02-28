package polymorphism;

class parent {

	void add(int a, int b) {
		System.out.println("add:" + (a + b));
	}

	void add(int a, int b, int c) {
		System.out.println("add:" + (a + b + c));
	}

}

public class runtimepoly extends parent {

	// overriding method use => runtime poly

	void add(int a, int b) {
		int sum = a + b;
		System.out.println("addition of a+b =" + sum);
	}

	public static void main(String[] args) {

		runtimepoly p = new runtimepoly();

		p.add(34, 50);
		p.add(34, 40, 60);

	}

}
