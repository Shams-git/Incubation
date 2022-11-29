import java.util.Scanner;
public class WaveSortDemo2
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		
		//int arr2[]=new int[n];
		for(int i=0;i<n;i+=2)
		{
			for(int j=1;j<n;j++){
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			}
		}
		
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}
}