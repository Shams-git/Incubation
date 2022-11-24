import java.util.*;
class Diw6{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("enter the size of array");
int size=s.nextInt();
int arr1[]=new int[size];
int arr2[]=new int[size-1];
System.out.println("enter the first array elements");
for(int i=0;i<size;i++)
arr1[i]=s.nextInt();

System.out.println("enter the second array elements");
for(int i=0;i<arr2.length;i++)
arr2[i]=s.nextInt();

int index=0;
for(int i=0;i<size;i++){
if(arr1[i]!=arr2[i]){
index=1;
++index;
break;
}
}
System.out.println("miss the index is:"+index);
}
}