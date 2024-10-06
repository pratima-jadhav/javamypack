package MyPack;

import java.util.Scanner;
class Fact
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in) ;   //new is allocate dynamic memory for obj      
		
		int a,n,ans=1;
		
		System.out.println("Enter a number");
		n=obj.nextInt();
	
		for(a=1;a<=n;a++)
		{
			
			ans=ans*a;
			
		}	
			System.out.println("Factorial of  "+n + " is "+ ans);

	}
}
