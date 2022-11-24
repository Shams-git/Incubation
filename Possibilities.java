import java.util.*;
class Possibilities{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("enter the size of array");
int size=s.nextInt();
System.out.println("enter target val");
int target=s.nextInt();
int []arr=new int[size];
System.out.println("enter the values to store");
for(int i=0;i<size;i++)
arr[i]=s.nextInt();

int count=0;
for(int i=0;i<size;i++){
int sum=-arr[i];
for(int j=0;j<size;j++){
if(i!=j){
sum+=arr[j];
}

}
if(sum==target){
count++;
}

}

}
}