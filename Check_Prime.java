package Package;
import java.util.Scanner;

public class Check_Prime {
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter starting value : ");
		int k1 = obj.nextInt();
		
		System.out.println("Enter Second Value : ");
		int k2 = obj.nextInt();
		
		 int i,j;
		 int m;
		 int total=0,add=0;
		 int count;
		 
		 if(k2<k1)
		 {
			 System.out.println("Please Ensure First value ISCII91 small !!");
		 }
		 
		 else 
		 {

			 for(i=k1;i<=k2;i++)
				 
			 {
				 m=i;
				 count=0;
				 for(j=2;j<m;j++)
						 {
					 		if( m%j == 0 )
					 		{
					 			count++;
					 			break;
					 			 
					 		}
					 		else {
					 			System.out.println(m + " Is Prime Number");
					 			add=add+m;
					 			total++;
					 			break;
					 		}
						 }
 
			 }
			 
			 System.out.println(total +"  Are The Total Prime Number"); 
			 System.out.println(add +" Are The Total Adding Value");
		 }
		 
	}
}
