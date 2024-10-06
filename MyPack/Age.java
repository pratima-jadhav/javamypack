package MyPack;

import java.util.Scanner;
public class Age
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in) ;   //new is allocate dynamic memory for obj      
		
		int a;
		System.out.println("Enter the Age");
		a=obj.nextInt();

		if(a>=0 && a<=17)
		System.out.println("Minor");

		else
		if(a>=18 && a<=59)
		System.out.println("Major");

		else
		if(a>=60 && a<=100)
		System.out.println("Senior Citizen");

		else
		System.out.println("Invalid Age");		
	}
}
