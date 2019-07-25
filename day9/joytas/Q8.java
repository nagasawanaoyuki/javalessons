import java.util.*;
public class Q8{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("10月は英語で何?>");
		String month=sc.next();
		if(month.toLowerCase().equals("october")){
			System.out.println("OK");
		}else{
			System.out.println("NG");
		}
	}
}
