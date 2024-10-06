package MyPack;
import java.util.Scanner;
class Switch
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in) ;   //new is allocate dynamic memory for obj      
		
		int a,b,c,ch;
		

		System.out.println("Enter value for a");
		a=obj.nextInt();

		System.out.println("Enter value for b");
		b=obj.nextInt();

		System.out.println("1 Addition 2 Subtraction");
		System.out.println("Enter Choice");
		ch=obj.nextInt();

		switch(ch)
		{
			case 1:
			c=a+b;
			System.out.println("Addtion ="+c);
			break;
		
			case 2:
			c=a-b;
			System.out.println("Subtraction ="+c);
			break;
			
			default:
			System.out.println("Invalid ");	
			break;
		}	
	}
}
