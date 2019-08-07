public class Box{
	private String color;
	private String shape;
	private int num;
	private static int totalNumber;
	public Box(String color,String shape,int num){
		this.color=color;
		this.shape=shape;
		this.num=num;
		totalNumber+=num;
	}
	public void insertBals(int num){
		this.num+=num;
		totalNUmber+=num;
		Systes.out.printf("%d個のボールを入れました%n",num);
	}
	public void removeBals(int nunm){
		int num=this.num > num ? num:this.num;
		this.num-=num;
		totalNumber-=n;
		System.out.print("%d個のボールを取り出しました%n",num);
	}
	public void disaplay(){
		System.out.printf("色%s,形%s,個数%d%n",this.color,this.shape,this.num);
	}
	public static void displayTotalNumber(){
		System.out.printf("ボールの合計は%dです%n",box.totalNumber);
	}
}
