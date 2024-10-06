package MyPack;
import java.util.Scanner;
 class EvenOdd
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in) ;   //new is allocate dynamic memory for obj      
		
		int a,even=0,odd=0,i=1,e=0,o=0;
		
		System.out.println("Enter 10 number");
		
		while(i<=10)
		{
			System.out.println("Enter a number");
			a=obj.nextInt();
			if(a%2==0)
			{
				even=even+a;
				e=e+1;
			}
			else
			{
				odd=odd+a;
				o=o+1;
			}
			i++;				
		}	
			System.out.println("Even Total = "+even);
			System.out.println("Even Total count = "+e);
			System.out.println("Odd Total  = "+odd);
			System.out.println("Odd Total count = "+o);
	}
}