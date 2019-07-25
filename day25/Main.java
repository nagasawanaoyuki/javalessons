import my.util.*;
public class Main{
	public static void main(String[] args){
		int a=Common.input("正の整数a>");
		int b=Common.input("正の整数b>");
		while(true){
			int select=Common.input("番号を入力1.和,2.差,3.積,4.最大公約数,5.終了>");
			switch(select){
			case 1:
				Common.print(a+b);
				break;
			case 2:
				Common.print(a-b);
				break;
			case 3:
				Common.print(a*b);
				break;
			case 4:
				Common.print(Common.gcd(a,b));
				break;
			default:
				Common.print("アプリを終了します");
				return;
			}
		}
	}
}
