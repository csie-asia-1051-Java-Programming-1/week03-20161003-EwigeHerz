package ex;
import java.util.*;
/*
 * Topic: 輸入一正整數，判斷其奇偶數。
 * Date: 2016/10/03
 * Author: 105021027 陳宴湘
 */

public class ex05_105021027 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    if(x%2==0){
    	System.out.print("偶數");
    }
    else{
    	System.out.print("奇數");
    }
	}

}
