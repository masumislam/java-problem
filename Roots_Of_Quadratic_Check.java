package Package_1;
import java.util.Scanner;

public class Roots_Of_Quadratic_Check {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.print("Enter Any value : " );
		int a = obj.nextInt();

		System.out.print("Enter Any value : " );
		int b = obj.nextInt();
		
		System.out.print("Enter Any value : " );
		int c = obj.nextInt();
		
		double root1,root2,d,imaginary;
		
		
		
		d=(b*b)-(4*a*c);
		if(d>0)
		{
			root1=(-b+Math.sqrt(d) / (2 * a ));           // 2,6,1
			root2=(-b-Math.sqrt(d) / (2 * a ));
			
			System.out.println("Two Real Roots Exist");
			System.out.println("Root 1 Is : " + root1);
			System.out.println("Root 2 Is : " + root2);
		}
		else if(d==0)
		{
			root1=root2=(-(b))/(2*a);                    // 9,4,1
			
			System.out.println("Two Equal Real Root Exist");
			System.out.println("Root 1 Is : " + root1);
			System.out.println("Root 2 Is : " + root2);
		}
		
		else if(d<0)
		{
			root1=root2=(-(b))/(2*a);
			imaginary=Math.sqrt(-d) / (2 * a);          // 6,7,5
			
			System.out.println("Two Imagin Root Exist");
			System.out.println("Root 1 Is : " + root1 + "+" + imaginary);
			System.out.println("Root 2 Is : " + root2 + "-" + imaginary);
		}
		/*else
		{                                               //  6,7,5
			System.out.println("No Real Roots Exist !!");
		}*/
		
		
		
		
	}

}
