import java.util.*;
public class Q13{
	public static void main(String[] args){
		int count=0;
		Random rand=new Random();
		while(true){
			count++;
			int num=rand.nextInt(101);
			if(num==100){
				break;
			}
		}
		System.out.println(count+"回目に100がでました!");
	}
}
