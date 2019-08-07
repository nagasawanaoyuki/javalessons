import java.util.*;
public class BicycleApp{
	public static void main(String[] args){
		Scanner sc=new Scaner(System.in);
		System.out.print("自転車を選んでください");		
		System.out.print("0 自転車　1電動自転車 2終了");	
		int select=sc.nextInt();
		while(true){
		switch(select){
			case 0:
			System.out.print("1走る　2降りる");
			select=sc.nextInt();
			switch(select){
			    case 1:
				Bicycle.ride();
				break;
				case 2:
				System.out.print("自転車を降りました");
				break;
			}
			case 1:
			System.out.print("1走る　2降りる 3充電");
			select=sc.nextInt();
			switch(select){
			    case 1:
				ElectricBicycle.ride();
				break;
				case 2:
				System.out.print("自転車を降りました");
				break;
				case 3:
                 ElectricBicycle.batteryCharge();
				break;	
		}
	}
	}
}
