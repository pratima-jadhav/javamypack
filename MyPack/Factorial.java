package MyPack;

import java.util.Scanner;
class Factorial
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in) ;   //new is allocate dynamic memory for obj      
		
		int a,n,ans=1;
		
		System.out.println("Enter a number");
		a=obj.nextInt();
		n=a;
		while(a>=1)
		{
			
			ans=ans*a;
			a--;
		}	
			System.out.println("Factorial of  "+n+ ans);

	}
}