import java.util.*;
public class FindOddOccurances{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("enter the size of array:");
int size=s.nextInt();
int arr[]=new int[size];
System.out.print("enter the elements of array:");
for(int i=0;i<size;i++)
arr[i]=s.nextInt();

for(int i=0;i<size;i++){
	if(arr[i]!='-'){
for(int j=i+1;j<size;j++){
if(arr[i]==arr[j]){
arr[i]=arr[j]='-';
}
}
}
}
for(int i=0;i<size;i++){
if(arr[i]!='-'){
System.out.print(arr[i]+" ");
}
}
}
}