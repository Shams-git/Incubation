import java.util.*;
class Vowels{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
String str=s.next();
char a[]=str.toCharArray();
for(int i=0;i<a.length;i++){
if(a[i]=="a"||str[i]=="e"||a[i]=="i"||a[i]=="o"||a[i]=="u"||a[i]=="A"||a[i]=="E"||a[i]=="I"||a[i]=="O"||a[i]=="U"){
System.out.println(str[i]-1);
System.out.println(str[i]);
}
}