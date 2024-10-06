package MyPack;
 import java.util.Scanner;
public class Digit
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in) ;   //new is allocate dynamic memory for obj      
		
		int a,n,ans=0,count=0;
		
		System.out.println("Enter a number");
		a=obj.nextInt();
		
		while(a>=1)
		{
			n=a%10;
			count++;
			ans=ans+n;
			a=a/10;
		}	
			System.out.println("Total = "+ans);
			System.out.println("Total Digit = "+count);


	}
}
