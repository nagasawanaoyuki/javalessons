import java.util.*;
public class Q1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("一文字いれてください>");
		String str=sc.next();
		System.out.print("幅を入れてください>");
		int width=sc.nextInt();
		char c=str.charAt(0);
		printSquare(c,width);

	}
	static void printSquare(char c,int width){
		for(int i=0;i<width;i++){
			for(int j=0;j<width;j++){
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
