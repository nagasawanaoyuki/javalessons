public class Book extends TangibleAsset{
	private String isbn;
	public Book(String isbn){
		this.isbn=isbn;
	}
	public String getIsbn(){
		return this.isbn;
	}
}
