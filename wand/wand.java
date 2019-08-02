public class wand{
    private String mame;
	private double power;
	public wand(){
		this.name="杖";
		this.power=10.2;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		if(name==null||name.length()<3){
			throw new IllegalArgumentException
			("名前が異常です");
		this.name=name;
	}
	public double getPower(){	
		return this.power;
	}
	public void setPower(double power){
		if(power<0.5||power>100.0){
			throw new IllegalArgumentException
			("魔力が異常です");
		}
		this.power=power;
	}
}
