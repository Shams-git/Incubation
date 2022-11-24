import java.util.*;
class Str{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
String str=s.next();
int i;
int j;
char c[]=str.toCharArray();
vowels(c);
for(i=0;i<c.length;i++){
	int occur=1;
for(j=i+1;j<c.length;j++){
if(c[i]==c[j]){	
	System.out.println(c[i]+"="+occur);
	occur++;

break;
}

/*if(c[i]==c[j]){
c[i]='\0';
}*/
}
System.out.println(c[i]+"="+occur);	
}

}
static void vowels(char c[]){
	int vowels=0;
	for(int i=0;i<c.length;i++){
		for(int j=0;j<c.length;j++){
if(c[i]==c[j]&&c[i]=='A'||c[i]=='a'||c[i]=='E'||c[i]=='e'||c[i]=='I'||c[i]=='i'||c[i]=='O'||c[i]=='o'||c[i]=='U'||c[i]=='u'){

++vowels;
break;
}
}	
c[i]='\0';	
}
System.out.println("vowels occured is:"+vowels);
}
}