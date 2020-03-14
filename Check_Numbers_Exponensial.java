package Package;
import java.util.Scanner;

public class Check_Numbers_Exponensial {

	public static void main(String[] args) {
		
		int i,j;
		
		//int val=0;
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Any Number : ");
		int s = obj.nextInt();
		
		//Scanner obj1 = new Scanner(System.in);
		System.out.println("Enter Exponential Number : ");
		int m = obj.nextInt();
		
		j=s;
		for(i=1;i<m;i++)
		{
			j=j*s;
		}
		System.out.println("The Final Value Is : "+ j);
		
		
	}

}
