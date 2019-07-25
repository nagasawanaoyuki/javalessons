import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("正の整数>");
		int max=sc.nextInt();
		int i=1;
		String ans;
		while(i<=max){
			if(i %3 == 0 && i % 5== 0){
				ans="FizzBuzz";
			}else if(i % 3==0){
				ans="Fizz";
			}else if(i % 5==0){
				ans="Buzz";
			}else{
				ans=i+"";
			}
			System.out.println(ans);
			i++;
		}
	}
}
