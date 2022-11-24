import java.util.Scanner;
public class Main
{
static Scanner s=new Scanner(System.in);
public static void main(String args[])
	{
		int num=0;
		do
		{
		System.out.println("1-'*'pattern \t 2-'number' pattern \t 3-'alphabet letter' pattern");
		num=s.nextInt();
		switch(num)
		{
				case 1:
				Pattern1 p1=new Pattern1();
				p1.pattern();
				break;
				
				case 2:
				Pattern3 p2=new Pattern3();
				p2.pattern();
				break;
				
				case 3:
				Pattern5 p3=new Pattern5();
				p3.pattern();
				break;
		}
		}while(num<4);
		
	}
}
class Pattern1 extends Main
{
public static void pattern()
	{
		System.out.println("Enter the input:");
	int row=s.nextInt();
	for(int i=0;i<=row;i++)
		{
		for(int j=0;j<i;j++)
		{
		System.out.print("*");
		}
		System.out.println();
		}
		pattern1();
	}
public static void pattern1()
	{
		System.out.println("Enter the input:");
	int row=s.nextInt();
	for(int i=0;i<row;i++)
		{
		for(int j=row;j>i;j--)
		{
		System.out.print(" ");
		}
		for(int j=0;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
		}
		
	}
}
class Pattern3 extends Main
{
public static void pattern()
	{
		System.out.println("enter rows : ");
		int i,j,num=1;
		int rows=s.nextInt();
		for(i=0;i<rows;i++)
		{
			for(j=0;j<=i;j++)
			{
			System.out.print(num+" ");
			++num;
			}
		System.out.print("\n");
		}
		pattern3();
	}
public static void pattern3()
	{
			System.out.println("enter rows : ");
			int i,j,num=1;
			int rows=s.nextInt();
			for(i=0;i<rows;i++)
				{
					for(j=0;j<=i;j++){
					System.out.print(num+" ");
					
				}
				++num;
				System.out.println();
	}
}
}
class Pattern5 extends Main
{
public static void pattern()
	{
		System.out.println("Enter the input:");
	int n=s.nextInt();
	char c=64;
	for(int i=0;i<=n;i++)
		{
		for(int j=0;j<i;j++)
			{
			System.out.print(c);
			}
			c++;
		System.out.println();
		}
		pattern5();
	}
public static void pattern5()
	{
		System.out.println("Enter the input:");
	int n=s.nextInt();
	char c=65;
	for(int i=0;i<=n;i++)
		{
		for(int j=0;j<i;j++)
			{
			System.out.print(c);
			c++;
			}
		System.out.println();
	}
}
}