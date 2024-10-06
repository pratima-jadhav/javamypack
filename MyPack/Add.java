package MyPack;

import java.util.Scanner;
class Add
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in) ;   //new is allocate dynamic memory for obj      
		int a,b,c;
		System.out.println("Enter the value for a");
		a=obj.nextInt();
		System.out.println("Enter the value for b");
		b=obj.nextInt();
		c=a+b;
		System.out.println("Addition ="+c);
	}
}