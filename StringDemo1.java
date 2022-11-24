import java.util.*;
public class StringDemo1
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String name1=s.nextLine();
		String name2=s.nextLine();
		String add=name1 + name2;
		System.out.print("the name is "+add);
	}
}