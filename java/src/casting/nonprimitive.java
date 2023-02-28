package casting;

class parent{
	
	void a() {
		
		System.out.println("a method in parent class");
	}
}


class child extends parent{
	
	void a() {
		
		System.out.println("a mehtod in child class override");
	}
}




public class nonprimitive {

	public static void main(String[] args) {
		
		
		parent p=new child();
		
		p.a();
		
		

	}

}
