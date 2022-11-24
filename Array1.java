import java.util.*;
public class Array1
{
public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size of array:");
	int n=s.nextInt();
	int arr[]=new int[n];
	System.out.print("Enter the elements of array:");
	for(int i=0;i<n;i++)
	arr[i]=s.nextInt();
	int sum=0;
	
	
	for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				for(int k=j+1;k<n;k++)
				{
		if(arr[i]%2==0)
			{
				
			if(arr[j]%2!=0){
				if(arr[k]%2!=0)
				{
					arr[k]=arr[i];
					--sum;
				}
			arr[j]='-';
							}

			}
				}
			}
		}
	for(int i=0;i<n;i++)
		{
			if(arr[i]!='-')
			{
	sum+=arr[i];
	
			}
		}
		System.out.println(sum);
	}
}