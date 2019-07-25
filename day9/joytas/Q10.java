import java.util.*;
public class Q10{
	public static void main(String[] args){
		System.out.print("日本の信号で渡っていい色は（漢字一文字)>");
		Scanner sc=new Scanner(System.in);
		String color=sc.next();
		switch(color){
		case "緑":
		case "青":
			System.out.println("OK");
			break;
		default:
			System.out.println("NG");
		}
	}
}
