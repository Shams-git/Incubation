import java.util.Scanner;
public class GameDemo {
	static Scanner s=new Scanner(System.in);
public static void main(String[] args) {
Game g=new Game();
g.game();
}
}
class Game extends GameDemo{
public void game() {
	Scanner s=new Scanner(System.in);
	int a=1;
	int b=a+1;
	char [][]c= {{'1','2','3'},{'4','5','6'},{'7','8','9'}};
	int count=0;
	boolean flag=false;
	display(c);
	do {
	System.out.println("enter the value of x:");
char player1=s.next().charAt(0);//,player2=s.next();
	for(int i=0;i<c.length;i++) {
		for(int j=0;j<c.length;j++) {
			if(player1==c[i][j]) {
				c[i][j]='x';
				flag=true;
				break;
			}
		/*	if(flag==false){
				game();
				break;
			}*/
			}
}
        if(c[0][0]=='x'&&c[1][0]=='x'&&c[2][0]=='x'||c[0][2]=='x'&&c[1][2]=='x'&&c[2][2]=='x'||c[0][0]=='x'&&c[0][1]=='x'&&c[0][2]=='x'||c[1][0]=='x'&&c[1][1]=='x'&&c[1][2]=='x'||c[2][0]=='x'&&c[2][1]=='x'&&c[2][2]=='x'||c[0][0]=='x'&&c[1][1]=='x'&&c[2][2]=='x'||c[2][0]=='x'&&c[1][1]=='x'&&c[0][2]=='x'||c[0][1]=='x'&&c[1][1]=='x'&&c[2][1]=='x') {
			System.out.println("x is win! Thanks for Playing.");
			break;
		}
		if(oinputMethod(c))
			return;
		display(c);
	}while(true);
	}
	boolean oinputMethod(char c[][]){
		boolean flag=false;
	System.out.println("enter the value of o:");
	char player2=s.next().charAt(0);//,player2=s.next();
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c.length;j++) {
				if(player2==(c[i][j])) {
				    c[i][j]='o';
					flag=true;
					break;
			    }
				/*if(flag==false){
					oinputMethod(c);
					break;
				}*/
			   }
	          }
		if(c[0][0]=='o'&&c[1][0]=='o'&&c[2][0]=='o'||c[0][2]=='o'&&c[1][2]=='o'&&c[2][2]=='o'||c[0][0]=='o'&&c[0][1]=='o'&&c[0][2]=='o'||c[1][0]=='o'&&c[1][1]=='o'&&c[1][2]=='o'||c[2][0]=='o'&&c[2][1]=='o'&&c[2][2]=='o'||c[0][0]=='o'&&c[1][1]=='o'&&c[2][2]=='o'||c[2][0]=='o'&&c[1][1]=='o'&&c[0][2]=='o'||c[0][1]=='o'&&c[1][1]=='o'&&c[2][1]=='o') {
			System.out.println("o is win! Thanks for Playing.");
			return true;
		}
		return false;
		}
void display(char c[][])
{
	for(int i=0;i<c.length;i++){
		for(int j=0;j<c.length;j++){
			System.out.print(c[i][j]+" ");
	}
	System.out.println();
}
}
}
