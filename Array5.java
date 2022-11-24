import java.util.*;
class Array5{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("enter the size of array");
int size=s.nextInt();
int i;
int count=0;
int arr[]=new int[size];
System.out.println("enter array numbers to store:");
for(i=0;i<size;i++)
arr[i]=s.nextInt();

int[] c=new int[11];
for(int j=0;j<size;j++){
count=1;
if(arr[j]!='_'){
	for(int k=j+1;k<size;k++) {
	if(arr[j]==arr[k]){
		count++;
		arr[k]='_';
	}
	}
	c[arr[j]]=count;
}

}
for(int j=0;j<11;j++)
	System.out.print(j+" ");
	System.out.println();

for(int j=0;j<c.length;j++)
	System.out.print(c[j]+" ");

int max=c[0];
int index=0;

for(int j=0;j<c.length;j++){
	if(max<c[j]){
		max=c[j];
		index=j;
	}
}
System.out.println();
System.out.println("mode : "+index);
}
}