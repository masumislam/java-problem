package Package;
import java.util.Scanner;

public class Leap_Year_Checking {
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter The Year : ");
		int k = obj.nextInt();
		
		//int a=-2021;
		
		if (k>=4)
		{
			if(k%4==0)
			{
				System.out.println(k + " Is Leap Year");
			}
			else
			{
				System.out.println(k + " Is Not Leap Year");
			}
		}
		else
		{
			System.out.println("Please Entere Above 4 !!");
		}
	}

}
