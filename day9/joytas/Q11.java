import java.util.*;
public class Q11{
	public static void main(String[] args){
		Random rand=new Random();
		int dice1=rand.nextInt(6)+1;
		int dice2=rand.nextInt(6)+1;
		int score=dice1+dice2;
		if(dice1==dice2){
			score*=2;
		}
		System.out.printf("dice1:%d dice2:%d score:%d",dice1,dice2,score);
	}
}
