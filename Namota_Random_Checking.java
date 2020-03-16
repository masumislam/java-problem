package Package;
import java.util.Scanner;

public class Namota_Random_Checking {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter Any value : " );
		int i = obj.nextInt();
		
		
		int j;
		
		
			while(i<7)
			{
				j=1;
				while (j<11)
				{
					System.out.println(i +" * "+ j +" = " + i*j);
					j++;
				}
				System.out.println();
				System.out.println("=========================");
				System.out.println();
				i++;
				
			}
			
			
		}
	

}
