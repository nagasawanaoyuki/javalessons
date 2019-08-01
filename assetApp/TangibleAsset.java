public abstract class TangibleAsset extends Asset{
	private String name;
	private int price;
	private String color;
	public TanginbleAsset(String name,int price,String color){
		this.name=name;
		this.price=price;
		this.color=color;
	}
	public void getName(){
		return this.name;
	}
	public void getPrice(){
		return this.price;
	}
	public void getColor(){
		return this.color;
	}
}
