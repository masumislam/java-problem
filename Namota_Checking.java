package Package;
import java.util.Scanner;

public class Namota_Checking {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter Any value : " );
		int a = obj.nextInt();
		
		int mul;
		
		int i;
		for(i=1;i<=10;i++)
		{
			mul = a*i;
			System.out.println(a + " * " + i +" = " + mul);
		}

	}

}
