public class Wizard{
	private int hp;
	private int mp;
    private	String name;
	private wand wand;
	public Wimzard(){
		this.hp=10;
		this.mp=10;
		this.name="あいうえお";
	}
    private void Heal(Hero h){
    int basePoint=10;
	int recovPoint=(int)(basePoint*this.wand.power);
	h.setHp(h.getHp()+recovPoint);
	System.out.println(h.getName()+"のHPを"+recovPoint+"回復した");
	}
	public int getHp(){
		return this.hp;
	}
	public void setHp(int hp){
		if(hp<0){
			hp=0;
		}
		this.hp=hp;
    }
	public int getMp(){
			return this.mp;
	}
	public void setMp(int mp){
		if(mp<0){
			throw new IllegalArgumentException("MPがおかしいです");
		}
		this.mp=mp;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		if(name==null||name.length<3){
			throw new IllegalArgumentException
			("名前がおかしいです");
		}
		this.name=name;
	}
	public wand getwand(){
		return this.wand;
	}
	public void setWand(wand wand){
		if(wand==null){
			throw new IllegalArgumentException
			("nullではダメです");
		}
		this.wand=wand;
	}
}
