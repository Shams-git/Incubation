import java.util.Scanner;
class Compare2numbers{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("enter two numbers to compare:");
int a=s.nextInt();
int b=s.nextInt();
if(a>b){
System.out.println(a+">"+b);
}
if(a<b){
System.out.println(a+"<"+b);
}
if(a>=b){
System.out.println(a+">="+b);
}
if(a<=b){
System.out.println(a+"<="+b);
}
if(a==b){
System.out.println(a+"=="+b);
}
if(a!=b){
System.out.println(a+"!="+b);
}
}
}