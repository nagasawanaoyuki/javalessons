import java.util.*;
public class OfficeWorkerApp{
	public static void main(String[] args){
		System.out.print("ぶか");
		OfficeWorker[] bms=new OfficeWorker[3];
		Random rand=new Random();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<bms.length;i++){
			System.out.print(i+1+"人目の名前を入力して下さい");
			String name=sc.nextLine();
			int type=rand.nextInt(3);
			switch(type){
				case 0:
				bms[i]=new OrdinaryOfficeWorker(name);
				break;
				case 1:
				bms[i]=new EliteOfficeWorker(name);
				break;
				case 2:
				 bms[i]=new LazyOfficeWorker(name);
				 break;
			}
			bms[i].introduece();
		}
		while(true){
				System.out.print("働きぶり");
				for(int i=0;i<=bms.lentgh;i++){
					System.out.print("asj");
				}
				System.out.print("番号");
				int select=sc.nextInt();
				if(select==bms.length){
					System.out.print("終了");
					return;
					}else{
						bms[select].work();
				}
			}
	}
}
