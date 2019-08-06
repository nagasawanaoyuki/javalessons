public class Main{
	public static void main(String[] args){
		long start=System.currentTimeMillis();
		long sum=0L;
		for(int i=0;i<100000000;i++){
			if(i%3==0||i%7==0){
				sum+=i;
			}
		}
		long end=System.currentTimeMillis();
		System.out.print("答えは"+sum+"かかった時間は"+(end-start)+"ミリ秒");
	}
}
