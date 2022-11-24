import java.util.*;
public class Swap
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
boolean flag=false;
for(int i=0;i<a;i++)
{
	if(a!=0)
	{
	for(int j=0;j<a;j++)
	{
if((i*i+j*j)==a)
{
    flag=true;
break;
	}
   
}
	}
	if(flag==true)
	   break;
}
System.out.println(flag);
}
}