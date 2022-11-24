import java.util.*;
class Diw12{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("enter the first str");
String str1=s.next();
System.out.println("enter second str");
String str2=s.next();
int temp[]=new int[str2.length()+1];
temp[0]=1;
int min;
for(int i=1;i<=str1.length();i++){
if(i<str2.length()){
min=i;
}
else{
min=str2.length();
}
for(int j=min;j>=1;j--){
if(str1.charAt(i-1)==str2.charAt(j-1)){
temp[j]+=temp[j-1];
}
}
}
System.out.println("output is "+temp[str2.length()]);
}
}