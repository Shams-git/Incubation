import java.util.Scanner;
class Circle{
public static void main(String args[]){
double pi=3.14159265358979323846;
Scanner sc=new Scanner(System.in);
System.out.println("enter the radius:");
double r=sc.nextDouble();
double area=2*pi*r;
double perimeter=pi*r*r;
System.out.println("area of circle is :"+area);
System.out.println("perimeter of circle is :"+perimeter);
}
}