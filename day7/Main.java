import java.util.*;
public class Main{
	public static void main(String[] args){
		Random rand=new Random();
		Scanner sc=new Scanner(System.in);
		final int MAX=5; //試行最大回数
		int ans=rand.nextInt(100)+1; //1~100の値をランダムに生成
		int userAns; //ユーザーの答えを保持する変数
		int count=0; //試行回数を保持する変数
		System.out.println("１～１００の番号決めたよ当ててね");
		do{
			count++; //回数を1増やす
			System.out.print("いくつかな>");
			userAns=sc.nextInt(); //ユーザーの答えをuserAnsに格納
			if(ans==userAns){
				System.out.println("当たり!");
				break;
			}
			if(count < MAX){
				if(userAns>ans){
					System.out.println("もっと下だよ");
				}else if(userAns<ans){
					System.out.println("もっと上だよ");
				}
			}else{
				System.out.println("残念～正解は"+ans+"でした");
			}
		}while(count<MAX); 
	}
}
