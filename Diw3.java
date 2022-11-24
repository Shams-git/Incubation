import java.util.*;
class Diw3{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("enter the size of array");
int size=s.nextInt();
int arr[]=new int[size];
for(int i=0;i<size;i++)
arr[i]=s.nextInt();

System.out.println("enter the sum val");
int sum=s.nextInt();
System.out.println(count(arr,size,sum));
}
static int count(int arr[],int n,int sum){
if(n<=0)
return 0;
else if(sum<0)
return 0;
else if(sum==0)
return 1;
return count(arr,n-1,sum)+count(arr,n,sum-arr[n-1]);
}
}