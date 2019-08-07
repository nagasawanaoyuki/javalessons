import java.util.*;
public class BoxApp{
	public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			Box box1=new Box("赤","円形",1);
			Box box2=new Box("青","四角",2);
			while(true){
				System.out.print("1,2,3,4");
				int select=sc.nextInt();
				if(select==1||select==2){
					System.out.print("0");
					box1.displayInfo();
					System.out.print("1");
					box2.displayIntfo();
				}
				switch(select){
					case 1:
					System.out.print("投入する箱番号入力");
					int boxNumber=se.nextInt();
					if(
					}
			}
		}
}
