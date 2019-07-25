import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class MethodLesson8{
	static int[] makeArrFirstToLast(int first,int last){
		int[] retArr=new int[Math.abs(first-last)+1];
		for(int i=0;i<retArr.length;i++){
			retArr[i]=first;
			if(first>=last){
				first--;
			}else{
				first++;
			}
		}
		return retArr;
	}
	public static void main(String[] args){
		int[] arr=makeArrFirstToLast(4,-2);
		System.out.println(Arrays.toString(arr));
	}
}
