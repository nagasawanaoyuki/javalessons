import java.util.*;
public class Main2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("ArrayListを使ってみよう!");
		System.out.println("Listに数字をどんどん追加していってみよう");
		ArrayList<Integer>list=new ArrayList<>();
		while(true){
	        System.out.println("要素追加するよ数字を入れてね(0で終了)");
		    int num=sc.nextInt();
			list.add(num);
			System.out.println(num+"をListに追加したよ");
			if(num==0){
			break;
			}
		}
		System.out.println("--結果--");
		System.out.println("要素数"+list.size());
		System.out.println("要素");
	}
}
