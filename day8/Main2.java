import java.util.*;
public class Main2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("整数a>");
		int a=sc.nextInt();
		System.out.print("整数b>");
		int b=sc.nextInt();
		if(b>a){
			while(b>=a){
				System.out.print(b+" ");
				b--;
			}
		}else{
			while(b<=a){
				System.out.print(b+" ");
				b++;
			}
		}
	}
}
