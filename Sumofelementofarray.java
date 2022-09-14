import java.util.Scanner;
class Sumofelementofarray{
public static void main(String args[]){
int num;
System.out.print("enter the number of element:");
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
int a[]=new int[num];
int sum=0;
for(int i=0;i<num;i++){
System.out.println("enter n "+(i+1));
a[i]=sc.nextInt();
}
for(int j=0;j<num;j++){
sum+=a[j];
}
System.out.println("sum of the arrays="+sum);
}
}