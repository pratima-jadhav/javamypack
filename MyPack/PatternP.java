package MyPack;

import java.util.Scanner;
class PatternP
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in) ;   //new is allocate dynamic memory for obj      
		
		int n,i,j;
		System.out.println("Enter  number line want");
		n=obj.nextInt();

		for(i=1;i<=n; i++)
		{
			for(j=1;j<=n; j++)
			{
                            System.out.print(" * ");
		         }
			System.out.println();
		}	

		
	}
}
