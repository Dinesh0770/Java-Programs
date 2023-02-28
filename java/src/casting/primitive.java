package casting;

public class primitive {

	
	void d() {
		
		System.out.println("hello ");
	}
	
	
	
	public static void main(String[] args) {
		
		
		primitive p=new primitive();
		
		p.d();
		
		
		float no=34.45f;
		System.out.println("before implicit casting"+no);
		
		double No=no;
		System.out.println("after implicit casting"+No);
		
System.out.println("");
		
		long no1=345l;
		
		System.out.println("before explicit casting"+no1);
		
		int No1=(int)no1;
		
		System.out.println("before explicit casting"+No1);
		
		
		
	}

}
