package testing;
import java.util.*;
public class prac_tables {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter number :");
		n=sc.nextInt();
int count=0;
		for(int i=1;i<=10;i++) {
			
			int sum=n*i;
			count++;
			System.out.println(count+": "+n+"*"+i+"="+sum);
			
		}
	
	}

}
