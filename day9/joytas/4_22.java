public class 4_22{
	public static void main(String[] args){
		int max=1000;
		int n1=0;
		int n2=1;
		System.out.println(n1);
		System.out.println(n2);
		while(true){
			int n3=n1+n2;
			if(n3>1000){
				break;
			}
			System.out.println(n3);
			n1=n2;
			n2=n3;
			
		}
	}
}
