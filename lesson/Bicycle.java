public class Bicycle{
	private int wheelSize;
	public Bicycle(int wheelSize){
		this.wheelSize=wheelSize;
	}
	public voud ride(){
		System.out.print("風をきって走ります");
	}
}
class ElectricBicycle extends Bycycle{
	static final int MAX=10;
	private int battery;
	}
	public void ride(){
		System.out.print("坂道だってラクラクです");
	}
	public void batteryCharge(){
		System.out.print("バッテリーを充電しました");		
	}
}
