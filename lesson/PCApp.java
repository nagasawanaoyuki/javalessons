import java.util.*;
public class PCApp{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		UsbConnectable[] devices={
			 new Mouse(),
			 new Memory(),
			 new CardReader()
	};
	PC pc=new PC();
	while(true){
		System.out.print("選択0q 1asdd 2sdfg ");
		int select=sc.nextInt();
		switch(select){
			case 0:
			pc.execApp();
			break;
			case 1:
			System.out.print("殿で倍使う0 ma 1 me 2card");
			int num=sc.nextInt();
			pc.setDevice(devices[num]);
			pc.usb();
			break;
			case 2:
			System.out.print("終了");
			return;
		}
	}
}
}
