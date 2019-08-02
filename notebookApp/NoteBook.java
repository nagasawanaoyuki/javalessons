public class NoteBook extends book{
	private String Contens;
	public NoteBook(int pagenumber,int price){
		super(pagenumber,price);				
	}
	public void append(String str){
			Contens+=Str;
	}
	public void information(){
	   super.information();
		System.out.println("ページ数価格内容表示"+this.Contens);
	}
}
