import java.util.*;
public class BookApp{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("本のページ数を入力して下さい");
		int pagenumber=sc.nextInt();
		System.out.println("本の価格を入力して下さい");
		int price=sc.nextInt();
		Book book=new Book(pagenuimber,price);
		System.out.println("ほんとページ数を入力して下さい");
		pagenmber=sc.nextInt();
		System.out.println("本の価格を入力して下さい");
		pricde=sc.nextInt();
		NoteBook notebook=new NoteBook(pagenumber,price);
		while(true){
			System.out.println("1. 本の情報表示　/ 2. ノートの情報表示　/ 3. ノートに追加書き込み / 4. 終了");
			int select=sc.nextInt();
			switch(select){
				case 1:
				book.information();
				break;
				case 2:
				notebook.information();
				break;
				case 3:
				System.out.println("追加書き込み");
				String str=sc.nextLine();
				notebook.append(str);
				break;
				case 4:
				System.out.println("終了");
				return;
			}
		}
	}
}
