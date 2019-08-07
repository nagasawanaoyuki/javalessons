import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("素数を探します");
		int begin;
		do{
			System.out.print("範囲の視点となる数を入力");
			begin=sc.nextInt();
			int num;
		}while(begin<2);
		do{
			System.out.print("いくつ探しますか");
			num=sc.nextInt();
		}while(num<1);

	}
}
