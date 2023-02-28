package Interface;

interface father {

	void f1();

	void f2();
}

interface mother extends daughter {

	void m1();

	void m2();

}

interface daughter{
	
	void d1();
}

  abstract class son implements father, mother  {

	public void f1() {
		System.out.println("son class inplements father1");
	}

	public void f2() {
		System.out.println("son class inplements father2");
	}

	public void m1() {
		System.out.println("son class inplements mother1");
	}

	public void m2() {
		System.out.println("son class inplements mother2");
	}

}

public abstract class interfacedemo extends son{

	public static void main(String[] args) {
//
//		father f=new son();
//		
//		f.f1();
//	
//		mother m=new son();
//		m.m2();
//		

	
	
	
	
	}

}
