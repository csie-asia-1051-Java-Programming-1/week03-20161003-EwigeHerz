package ex;
import java.util.*;
/*
 * Topic: 輸入一個字元，轉換其大小寫輸出 (大寫 ->小寫，小寫->大寫)
 * Date: 2016/10/03
 * Author: 105021027 陳宴湘
 */

public class ex03_105021027 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     char val = sc.next().charAt(0);
     if(val>65 &&val<=90)
   System.out.print((char)((int)val+32));
     else if (val>=97 &&val<=122)
    	 System.out.print((char)((int)val-32));
     else System.out.print("其他字元");
	}

}
