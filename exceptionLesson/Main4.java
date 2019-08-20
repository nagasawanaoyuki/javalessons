public class Main4{
	public static void main(String[] args){
		try{
		String s=null;
			System.out.println(s.length());
		}catch(NullPointerException e){
			System.out.println("NullPointerExeption例外をcatchしました");
			System.out.println("スタックトレース(ここから)--");
			e.printStackTrace();
			System.out.println("スタックトレース(ここまで)--");
		}
	}
}
