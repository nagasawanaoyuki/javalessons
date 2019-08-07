public class Book{
	private int page;
	private int price;
	public Book(int page,int price){
		this.page=page;
		this.price=price;
	}
	public void info(){
		System.out.printf("ページ数:%d%n価格:%d%n",this.page,this.price);
	}
}
class NoteBook extends Book{
	private String content="";
	public NoteBook(int page,int price){
		super(page,price);
	}
	public void append(String str){
		content+=str;
	}
	@Override
	public void info(){
		super.info();
		System.out.printf("内容:%s%n",this.content);
	}
}
