import java.util.*;
public class PerfectNumber{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int sum=0;
System.out.println("enter the number:");
int n=s.nextInt();
for(int i=1;i<n;i++){
if(n%i==0){
sum=sum+i;
}
}
if(sum==n){
System.out.println("true");
}
else
	System.out.println("false");
}
}