package Package;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter starting value : ");
		int k1 = obj.nextInt();
		
		System.out.println("Enter Second Value : ");
		int k2 = obj.nextInt();
		
		 //int k1=20,k2=50;
		 int i,j;
		 int m;
		 int total=0;
		 int count;
		 
		 for(i=k1;i<=k2;i++)
			 
		 {
			 m=i;
			 count=0;
			 for(j=2;j<m;j++)
					 {
				 		if( m%j == 0 )
				 		{
				 			count++;
				 			//break;
				 			//System.out.println("\t" +m);
				 		}
					 }
			 
			 		System.out.println(m +" caried "+ count);
			 		if (count==0)
			 			{
			 				System.out.println(m +"is prime number");
			 				total++;
			 			}
		 }
		 
		 System.out.println("Total Prime Number is : " + total); 
	}

}





































