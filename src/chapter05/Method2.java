package chapter05;

import java.util.Scanner;

public class Method2 {
	
	int cnt, num;
	boolean run=true;
	String str="";
	Method br;
	
	Scanner scan=new Scanner(System.in);
	
	public Method2() {
		Method br=new Method();
	
	
	while(run) {
		System.out.println("------------------------------------------");
		System.out.println("1. 빵 개수만 선택 | 2.빵 개수와 종류 선택 | 3.종료");
		System.out.println("------------------------------------------");
		System.out.print("선택 > ");
		
		num=scan.nextInt();
		
		switch (num) {
		case 1:
			System.out.print("주문할 빵의 갯수 : ");
			cnt=scan.nextInt();
			br.makeBread(cnt);
			break;

		default:
			System.out.println("잘못된 번호 입니다.");
		}//sw
	}//wh
	
	
	
}


}


