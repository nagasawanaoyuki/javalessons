public class VendingMachine{
	private int money;
	private int num;
	public VendingMachine(int n){
		this.insertGoods(n);
		this.insertCoins(0);
	}
	public void inserCoins(int money){
		this.money+=money;
		System.out.printf("現在の入金額%d円%n",this.money);
	}
	public int cansel(){
		int money=
	}
}
