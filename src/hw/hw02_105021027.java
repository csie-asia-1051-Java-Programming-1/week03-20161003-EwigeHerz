package hw;
import java.util.*;

/*
 * Topic: 讓使用者輸入多個數，統計正數、負數及零各有多少個。
 * Date: 2016/10/03
 * Author: 105021027 陳宴湘
 */
public class hw02_105021027 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		
	while(true){
		int x = sc.nextInt();
		if(x>0){
			a++;}
		else{
			if(x==0){
			b++;	
			}
			else{
				if(x<0){
					c++;}
			}
		}
		System.out.println("是否繼續Y/N");
		char y = sc.next().charAt(0);
		if(y=='N'){
			break;
		}
	}
	System.out.print(a+"個正數");
	System.out.print(b+"個零");
	System.out.print(c+"個負數");

}
}