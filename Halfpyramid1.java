import java.util.Scanner;
class Halfpyramid1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter rows : ");
int i,j,num=1;
int rows=sc.nextInt();
for(i=0;i<=rows;i++){
for(j=0;j<=i;j++){
System.out.print(num+" ");
++num;
}
System.out.print("\n");
}
}
}
