import java.util.*;
class Pattern{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int rows=s.nextInt();
for(int i=0;i<rows;i++){
int nocolinrows=rows>i?2*n-rows:rows;
for(int j=0;j<nocolinrows;j++){
System.out.print("* ");
}
System.out.println();
}
}
}