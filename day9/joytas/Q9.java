import java.util.*;
public class Q9{
	public static void main(String[] args){
		System.out.print("スペイン語で日曜は何?1:Lunes,2:Jueves,3:Doming >");
		Scanner sc=new Scanner(System.in);
		int ans=sc.nextInt();
		switch(ans){
		case 3:
			System.out.println("OK");
			break;
		default:
			System.out.println("NG");
		}
	}
}
