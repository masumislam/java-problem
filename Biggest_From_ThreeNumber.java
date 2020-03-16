package Package;
import java.util.Scanner;

public class Biggest_From_ThreeNumber {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter 1st Number :" );
		int a = obj.nextInt();
		
		System.out.println("Enter 2nd Number :" );
		int b = obj.nextInt();
		
		System.out.println("Enter 3rd Number :" );
		int c = obj.nextInt();
		
		
		if(a>=b && a>=c)
		{
			System.out.println("Largest Number Is : "+a);
		}
		else if(b>=a && b>=c)
		{
			System.out.println("Largest Number Is : "+b);
		}
		else
		{
			System.out.println("Largest Number Is : "+c);
		}
		
		
		
	}

}
