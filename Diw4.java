import java.util.*;
class Diw4{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("enter the array1 size");
int size1=s.nextInt();
System.out.println("enter the array2 size");
int size2=s.nextInt();
int arr1[]=new int[size1];
int arr2[]=new int[size2];
System.out.println("enter the first array");
for(int i=0;i<size1;i++)
arr1[i]=s.nextInt();

System.out.println("enter the second array");
for(int i=0;i<size2;i++)
arr2[i]=s.nextInt();

check(size1,size2,arr1,arr2);
}
static void check(int n1,int n2,int arr1[],int arr2[]){
int i=0,j=0;
for(i=0,j=0;i<n1&&j<n2;i++,j++){
if(arr1[i]>arr2[j]){
System.out.println(arr1[i]+" ");
}
else if(arr2[j]<arr1[i]){
System.out.println(arr1[j]+" ");
}
else{
System.out.println(arr2[j]+" ");
}
}
for(;i<n1;i++)
System.out.println(arr1[i]+" ");
for(;j<n2;j++)
System.out.println(arr2[j]+" ");
}
}