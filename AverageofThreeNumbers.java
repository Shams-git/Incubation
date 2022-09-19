import java.util.Scanner;
class AverageofThreeNumbers{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
double a,b,c,avg;
System.out.println("enter three number :");
a=sc.nextDouble();
b=sc.nextDouble();
c=sc.nextDouble();
avg=(a+b+c)/3;
System.out.println("average of three number is :"+avg);
}
}