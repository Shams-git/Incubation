import java.util.Scanner;
class ReverseString{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the String: ");
String ss=s.nextLine();
char[] ch=ss.toCharArray();

for(int i=ss.length()-1;i>=0;i--)
System.out.print(ch[i]);
}
}
