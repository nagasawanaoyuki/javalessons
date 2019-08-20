public class Main5{
	public static void main(String[] args){
		try{
			int i=Integer.parsetInt("三");
		}catch(NumberFormatException e){
			System.out.print("例外NUmberFormatiExceptionをcatchしました");
		}
	}
}
