import java.util.*;
public class BookApp{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("本のページ数を入力して下さい");
		int page=sc.nextInt();
		System.out.print("本の価格を入力して下さい");
		int price=sc.nextInt();
		Book book=new Book(page,price);
		System.out.print("ノートのページ巣を入力して下さい");
		page=sc.nextInt();
		System.out.print("ノートの価格を入力して下さい");
		price=sc.nextInt();
		NoteBook notebook=new NoteBook(page,price);
		while(true){
			System.out.print("1本の情報２ノートの情報３ノートに追加書き込み４終了");
			int select=sc.nextInt();
			switch(select){
				case 1:
				book.info();
				break;
				case 2:
				notebook.info();
				break;
				case 3:
				System.out.print("追加書き込み");
				String str=sc.nextLine();
				notebook.append(str);
				break;
				case 4:
				System.out.print("終了");
			}
		}
	}
}
