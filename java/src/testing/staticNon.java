package testing;

public class staticNon {

	static void di(int id, String name) {

		System.out.println(id + name);

	}

	static int di1(int a) {
int r=a;
		System.out.println(r);
		return r;

	}

	void di2(int id, String name) {

		System.out.println("" + id + name);
	}

	public static void main(String[] args) {

		staticNon s = new staticNon();

		s.di2(3, "xyz");

		staticNon.di(5, "csda");

		staticNon.di1(990);


		
		
//		System.out.println(s);
		
	}

}
