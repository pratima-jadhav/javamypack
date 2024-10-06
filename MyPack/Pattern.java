package MyPack;

import java.util.Scanner;
 class Pattern
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in) ;   //new is allocate dynamic memory for obj      
		
		int n,i,j;
		System.out.println("Enter  number of line want");
		n=obj.nextInt();

		for(i=1;i<=n; i++)
		{
			for(j=1;j<=i; j++)
			{
                            System.out.print(" * ");
		         }
			System.out.println();
		}	
		for(i=n-1;i>=1; i--)
		{
			for(j=1;j<=i; j++)

			{
                            System.out.print(" * ");
		         }	
			System.out.println();

		}
	}
}
