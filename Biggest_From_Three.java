package Package;
import java.util.Scanner;

public class Biggest_From_Three {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter 1st value :" );
		int a = obj.nextInt();
		
		System.out.println("Enter 2nd value :" );
		int b = obj.nextInt();
		
		System.out.println("Enter 3rd value :" );
		int c = obj.nextInt();
		
		int s;
		
		
		if(a>=b)
		{
			s=a;
		}
		else
		{
			s=b;
		}
		
		if(s>c)
		{
			System.out.println("Hight Value Is : "+s);
		}
		else
		{
			System.out.println("Hight Value Is : "+c);
		}
		
	}

}
