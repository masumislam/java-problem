package Package;
import java.util.Scanner;


public class GCD_Check {
	public static void main(String[] args)
	{
		
	 Scanner obj = new Scanner(System.in);
	 System.out.println();
	 int a =obj.nextInt();
	 
		//int a=60,b=24;
	 
	 //Scanner obj = new Scanner(System.in);
	 System.out.println();
	 int b = obj.nextInt();
	 
		int lcm;
		int m,k;
		
		m=a;
		k=b;
		
		while(m!=k)
		{
			if(m>k)
			{
				m=m-k;
			}
			else {
					k=k-m;
				}
			
		}
		 
		System.out.println("This is : " + k);
		
		
		
		lcm=(a*b)/k;
		System.out.println("The Lcm Number isNumber : " + lcm);
		
		
			
		
		
		
	}
	

}
