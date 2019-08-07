public class Wallet{
	private int money;
	public Wallet(int money){
		this.monoy=money >0 ? money:0;
	}
	public void inserCoins(int money){
		this.money+=money;
		System.out.printf("財布に%d円入れました%n",money);
	}
	public int takeOutMoney(int money){
		int money=this.money > money ? money :this.money;
		this.money-=money;
		System.out.printf("財布から%d円取り出しました%n",money);;
		return money;
	}
	public void display(){
		System.out.printf("現在の財布の中身%d円%n",this.money);
	}
}
