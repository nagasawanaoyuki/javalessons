import java.util.*;
public class Main2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("数字をカンマ区切りでいれてね>");
		int sum=0;
		String str=sc.next();
		String[]date=str.split(",");
		for(int i=0;i<date.length;i++){
			sum+=Integer.parseInt(date[i]);
		}
		System.out.println("和は"+sum);
	}
}
