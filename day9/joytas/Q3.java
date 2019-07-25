import java.util.*;
public class Q3{
	public static void main(String[] args){
		Random rand=new Random();
		int n=rand.nextInt(10)+1;
		String str;
		if(n % 2==0){
			str="偶数(even)";
		}else{
			str="奇数(odd)";
		}
		System.out.println(n+"は"+str);
	}
}
