package polymorphism;

public class compiletimepoly {

	void add() {
		System.out.println("wihtout parameter methoid");
	}
	
	void add(int a,int b) {
		
	int	sum=a+b;
		System.out.println("a+b "+sum);
	}
	
	void add(int a,String c) {
		
		String	sum=a+c;
			System.out.println("a+b "+sum);
		}
		
	
	
	public static void main(String[] args) {
	
	compiletimepoly g=new compiletimepoly();
	
	g.add();
	g.add(34, 67);
	g.add(45, "hello");
		
		
	}
	
}
