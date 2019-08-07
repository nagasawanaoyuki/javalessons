import java.util.*;
public class CopyMachineApp{
	public static void main(String[] args){
		System.out.print("最初に給紙する枚数を入力して下さい");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		CopyMachine cm=new CopyMachine(num);
		while(true){
			System.out.print("1 給紙　２コピー　３表示　４終了");
			int select=sc.nextInt();
			switch(select){
				case 1:
				System.out.print("給紙する枚数を入力して下さい");
				num=sc.nextInt();
				cm.feedPaper(num);
				break;
				case 2:
				System.out.print("コピーする枚数を入力して下さい");
				num=sc.nextInt();
				cm.copy(num);
				break;
				case 3:
				cm.display();
				break;
				default:
				System.out.print("アプリを終了");
				return;
			}
		}
	}
}
