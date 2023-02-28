package testing;

public class Return {
	static int addSubject(int a, int b, int c) {
		int sum = a + b + c;
		System.out.println("Totel of subject = " + a+b+c);
		return sum;
	}

	String getName(String fName, String lName) {
		return fName+" "+lName;
	}
	
	int getModVal(int a,int b) {
		return a%b;
	}
	
	static int hi(int j,int k) {
		
		System.out.println(j);
		System.out.println(k);
		int as=j+k;
		System.out.println(as +j +k);
		return as;
		
	}
	
	public static void main(String[] args) {

	
		int val=Return.hi(30,10);
		System.out.println("==="+val/2);
		
		Return.addSubject(3, 4, 77);
		
//		int totle = addSubject(56, 67, 72);
//
//		int avg = totle / 3;
//
//		System.out.println(avg);
//			//static
//		totle = addSubject(60, 62, 60);
//
//		 avg = totle / 3;
//
//		 
		 
//		System.out.println(a,b,c);

		// non static method
//		Return r=new Return();
//		
//		String fullName=r.getName("Sachin", "Tendulkar");
//		
//		System.out.println(fullName);
//		
//		// directly print
//		System.out.println(r.getModVal(50, 6));
//	
	}

	
	
	
}
