import java.util.*;
class ArrayUsingObj{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int size=s.nextInt();
int a[]=new int[size];
int b[]=new int[size];
System.out.println("enter the array of numbers:");
for(int i=0;i<size;i++){
a[i]=s.nextInt();
}
for(int i=0;i<size/2;i++)
 System.out.print(a[i]+" ");
System.out.println();
for(int i=size/2;i<size;i++)
	System.out.print(a[i]+" ");
}

}