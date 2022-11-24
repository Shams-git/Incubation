import java.util.*;
class Diw5{
public static void main(String sham[]){
Scanner s=new Scanner(System.in);
System.out.println("enter the size of array;");
int size=s.nextInt();
int arr[]=new int[size];
System.out.println("enter the array elements");
for(int i=0;i<size;i++)
arr[i]=s.nextInt();

for(int i=0;i<size;i++){
for(int j=i+1;j<size;j++){
if(arr[i]<arr[j]){
int temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
System.out.println("enter the k value");
int k=s.nextInt();
int count=0;
int countbig=0;
for(int i=0;i<size;i++){
count=1;
int diff=k-arr[i];
count++;
if(diff<0){
break;
}
if(diff==0){
if(count>=countbig){
countbig=count;
}
}
if(diff>0){
continue;
}
}
System.out.println("longest sub arr:"+countbig);
}

}