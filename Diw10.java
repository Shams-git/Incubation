import java.util.*;
class Diw10{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("enter the first array size");
int size1=s.nextInt();
System.out.println("enter the second array size");
int size2=s.nextInt();
int arr1[]=new int[size1];
int arr2[]=new int[size2];
System.out.println("entr the frst array elt");
for(int i=0;i<size1;i++)
arr1[i]=s.nextInt();

System.out.println("enter the second array elt");
for(int i=0;i<size2;i++)
arr2[i]=s.nextInt();

int j;
for(int i=0;i<size1;i++){
for(j=0;j<size2;j++)
if(arr1[i]==arr2[j])
break;
if(j==size2)
System.out.print(arr1[i]+" ");
}
}
}