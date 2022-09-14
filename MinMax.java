import java.util.Scanner;
class MinMax{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
int num;
System.out.println("enter the number of element:");
num=sc.nextInt();
int a[]=new int[num];
for(int i=0;i<num;i++){
System.out.println("enter the element of array:");
a[i]=sc.nextInt();
}
int max=a[0];
for(int i=0;i<a.length;i++){
if(a[i]>max){
max=a[i];

}
}
System.out.println("maximum element of array is:"+max);

int min=a[0];
for(int i=1;i<a.length;i++){
if(a[i]<min){
min=a[i];
}
}
System.out.println("minimum element of array is:"+min);
}
}