package Package;
import java.util.Scanner;

public class Profit_Loss {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Buying Price :" );
		int a = obj.nextInt();
		
		System.out.println("Enter Selling Price :" );
		int b = obj.nextInt(); 
		
		if (a>b)
		{
			a=a-b;
			System.out.println("Loss_Is : "+a);
		}
		else if(a==b)
		{
			System.out.println("There Has No Loss & No Profit  !!");
		}
		else
		{
			b=b-a;
			System.out.println("Profit Is : "+b);
		}

	}

}
