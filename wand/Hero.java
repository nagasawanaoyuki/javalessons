public class Hero{
	private String name;
	private int hp;
	public Hero(){
		this.name="hero01";
		this.hp=100;
	}
	public String getName(){
		return this.name;
	}
	public int getHp(){
		return this.hp;
	}
	public void setHp(int hp){
		this.hp=hp;
	}
}
