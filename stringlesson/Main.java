import my.util.*;
public class Main{
	public static void main(String[] args){
		String str="abcdefgh";
	    Common.print(str.length());//文字列長さ 8
		Common.print(str.startsWith("a"));//その文字列から始まるかtrue
		Common.print(str.endsWith("g"));//その文字列で終わるか false
		Common.print(str.substring(0,3));//部分文字列作成　abcを取り出す
		Common.print(str.substring(4));//引数１つはそこかた後ろefghを取り出す
		//置換(before,after) abcde:gh
	    Common.print(str.replace("f",":"));
		//指定文字で分割して配列を作る
		String[] date=str.split("d");
		Common.print(date[0]);//avc
		Common.print(date[1]);//efgh
		Common.print(str);//abcdefgh javaの文字列は変わらないので
	}
}
