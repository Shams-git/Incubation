import java.util.Scanner;
class SpecifiedExpression{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
double a=sc.nextDouble();
double b=sc.nextDouble();
double c=sc.nextDouble();
double d=sc.nextDouble();
double out=((a*b-b*b)/(c-d));
System.out.println("Specified Expression is :"+out);
}
}