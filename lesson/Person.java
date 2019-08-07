public class Person{
	private String name;
	private int score;
	public Person(String name,int score){
		this.name=name;
		this.score=score;
	}
	public String info(){
		return String.format("%s[%d]",this.name,this.score);
	}
	public String getName(){
		return name;
	}
	public int getScore(){
		return score;
	}
}
