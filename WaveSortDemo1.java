import java.util.*;
public class WaveSortDemo1
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter the elements of array: ");
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int arr2[]=new int[n];
		int j=0;
		for(int i=0;i<n;i=i+2)
			arr2[i]=arr[j++];	
		
		j=n-1;
		for(int i=1;i<n;i=i+2)
			arr2[i]=arr[j--];
		
		for(int i=0;i<n;i++)
			System.out.print(arr2[i]+" ");
	}
}