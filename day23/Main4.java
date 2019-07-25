import java.util.*;
public class Main4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("正の整数>");
		int num=sc.nextInt();
		cd(num);
	}
	static void cd(int n){
		for(int i=1;i<=n;i++){
			if(n%i==0){
				System.out.print(i+" ");
			}
		}
	}
}
