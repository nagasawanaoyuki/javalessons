public class Wii{
	private int id;
	public Wii(int id){
		this.id=id;
	}
	public void playOnTV(){
		System.out.print("TVで遊びます");
	}
	public void checkid(){
		System.out.print("SerialID"+this.id);
	}	
}
class WiiU extends Wii{
	public WiiU(int id){
		super(id);
	}
	public void playOnGamepad(){
		System.out.print("Gamepadで遊びます");
}
}


