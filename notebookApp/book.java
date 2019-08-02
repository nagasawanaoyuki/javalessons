public class book{
	private int pagenumber;
	private int price;
	public book(int pagenumber,int price){
		this.pagenumber=pagenumber;
		this.price=price;
	}
	public void pagenumber(){
		System.out.println(this.pagenumber+"ページあります");
	}	
	public void price(){
		System.out.println(this.price+"円です");
	}
}
