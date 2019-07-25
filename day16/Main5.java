import java.util.*;

public class Main5 {
  public static void main(String[] args ) throws Exception {
	  Scanner sc =new Scanner(System.in);
	  String num=sc.next();
	  if(num.charAt(1)==num.charAt(2)
			  && num.charAt(2)== num.charAt(3)){
		  System.out.println("Yes");
	  }else{
		  System.out.println("No");
	  }
  }
}
