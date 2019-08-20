public class Person{
	int age;
	public void setAge(int age){
		if(age<0){
			throw new IllegalArgumentException
			("年齢は正の数を指定すべきです指定値="+age);
		}
		this.age=age;
	}
}
