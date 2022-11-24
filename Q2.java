import java.util.Scanner;
public class Q2
{
public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the string:");
	String str=s.next();
	int result=0;
	for(int i=0;i<str.length();i++)
		{
		result*=26;
		result+=str.charAt(i)-'A'+1;
		}
		System.out.println(result);
	}
}