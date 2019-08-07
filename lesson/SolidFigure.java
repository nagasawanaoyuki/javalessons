public interface Solidfigure{
	void displayAreaInfo();
}
class Cube implements Solidfigure{
	private double width;
	public Cube(double width){
		this.width=width;
	}
	@Override
	public void displayAreaInfo(){
		System.out.print("asdfg11");
	}
}
