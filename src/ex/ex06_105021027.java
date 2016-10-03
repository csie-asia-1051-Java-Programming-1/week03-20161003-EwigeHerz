package ex;
import java.util.*;
/*
 * Topic: 讓使用者輸入x，並計算y值輸出，其公式如下：
 * y = 3*x2				若 x < -1
 * y = x3+3*x-3			若 -1 <= x <= 1
 * y = 2*x+3			若 x > 1
 * Date: 2016/10/03
 * Author: 105021027 陳宴湘
 */

public class ex06_105021027 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = 0;
    if(x < -1){
    	System.out.print(y = 3*(x*x));
    	
    }else{
    	if( -1<=x && x<=1){
    		System.out.print(y=(x*x*x)+3*x-3);
    	}
    	else{
    		if(x>1){
    			System.out.print(2*x+3);
    		}
    	}
    }
	}

}
