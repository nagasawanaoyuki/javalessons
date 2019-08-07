public abstract class OfficeWorker{
	private String name;
	public OfficeWorker(String name){
		this.name=name;
	}
	public void introduece(){
		System.out.print("初めまして私は"+this.name+"です");
	}
	public abstract void work(){

	}
	public String getName(){
		return this.name;
	}
}
class OrdinaryOfficeWorker extends OfficeWorker{
	private OrdinaryOfficeWorker(String name){
		super(name);
	}
		@Override
		public void work(){
			System.out.print(this.getName()"a");
		}
}
class EliteOfficeWorker extends OfficeWorker{
	private EliteOfficeWorker(String name){
		super(name);
	}
	@Override
	public void work(){
		System.out.print(this.getName"a");
	}
}
class LazyOfficeWorker extends OfficeWorker{
	private LazyOfficeWorker(String name){
		super(name);
	}
	@Override
	public void work(){
		System.out.print(this.getName"u");
	}
}
