import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		System.out.print("何クラスありますか>");
		int classNum=sc.nextInt();
		int[][] data=new int[classNum][];
		int[] classScoreSum=new int[classNum];
		for(int i=0;i<classNum;i++){
			System.out.print(i+1+"組は何人ですか>");
			int studentNum=sc.nextInt();
			data[i]=new int[studentNum];
			for(int j=0;j<studentNum;j++){
				data[i][j]=rand.nextInt(101);
				classScoreSum[i]+=data[i][j];
			}
		}
		System.out.println("result");
		for(int i=0;i<data.length;i++){
			System.out.printf("%d組 平均[%.1f]:",i+1,(double)classScoreSum[i]/data[i].length);
			for(int j=0;j<data[i].length;j++){
				System.out.printf("%4d",data[i][j]);
			}
			System.out.println();
		}
	}
}

