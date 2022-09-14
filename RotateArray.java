import java.util.Scanner;
class RotateArray{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.println("enter the size of array");
int size=sc.nextInt();
int a[]=new int[size];
for(int i=0;i<size;++i){
System.out.println("enter the elements of array");
a[i]=sc.nextInt();
}
for(int i=0;i<a.length;i++){
System.out.print(a[i]+" ");
}
System.out.println("how many times rotate an array");
int n=sc.nextInt();
for(int i=0;i<n;i++){
int first=a[0];
for(int j=0;j<a.length-1;j++){
a[j]=a[j+1];
}
a[a.length-1]=first;
}
System.out.println();
System.out.println("output array");
for(int i=0;i<a.length;i++){
System.out.print(a[i]+" ");
}
}
}
