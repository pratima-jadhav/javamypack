package MyPack;

import java.util.Scanner;
class Fibonaci
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in); //new is allocate the dynamic memory for obj
		int a=0,b=1,f=1,n;

		System.out.println("Enter value for n");
		n=obj.nextInt();
		System.out.println(a);
		System.out.println(b);
		while(f<=n)
		{
     	System.out.println(f);
     	a=b;
     	b=f;
     	f=a+b;
		}

	}
}

