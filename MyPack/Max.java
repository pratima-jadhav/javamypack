package MyPack;

import java.util.Scanner;
 class Max
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in) ;   //new is allocate dynamic memory for obj      
		
		int i,n,max=0;
		System.out.println("Enter 5  number");
		
		for(i=0;i<5; i++)
		{
			n=obj.nextInt();		
			if(n>max)
			max=n;
		}
		System.out.println("Max no = "+max);	
		}		
}
