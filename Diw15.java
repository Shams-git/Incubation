import java.util.*;
class Diw15{
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
System.out.println("enter the size of array:");
int size=s.nextInt();
int largest=Integer.MIN_VALUE;
int smallest=Integer.MAX_VALUE;
int arr[]=new int[size];
System.out.println("enter the array elements");
for(int i=0;i<size;i++)
arr[i]=s.nextInt();

for(int j=0;j<size;j++){
largest=arr[j];
largest--;
System.out.println("missing value is :"+largest);
break;

//	largest=arr[j];
	//largest++;
	//++largest;
	//System.out.println("missing value is:"+largest);
	//break;
}
}

}