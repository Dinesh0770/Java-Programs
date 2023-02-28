package inheritance;

class parent{
	
	void d() {
		
		System.out.println("hello");
	}
	
	 
	
}




public class runtime extends parent{

	
	void d() {
		
		System.out.println("hello hi");
	}
	
	
	public static void main(String[] args) {
	
		runtime r=new runtime();
		
		r.d();
		
		
		
	}

}
