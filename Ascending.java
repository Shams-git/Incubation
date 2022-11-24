import java.util.Scanner;
import java.util.Arrays;
public class Ascending
{
public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int arr[]=new int[n];
	int temp=0;
	for(int i=0;i<n;i++)
	arr[i]=s.nextInt();
	
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if(arr[i]>arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	//Arrays.sort(arr);
	for(int i:arr)
	System.out.print(i);
	}
}