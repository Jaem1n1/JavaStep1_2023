package chapter05;

import java.util.Scanner;

public class Method {
	
	//멤버변수(=필드)
	
	//생성자 생략
	
	//메소드
	
	void makeBread() {
		System.out.println("빵을 만듭니다");
	}
	
	void makeBread(int count) {
		
		for(int i=0; i<count; i++) {
			System.out.println((i+1)+"번째 빵을 만들었습니다.");
		}
		System.out.println("요청하신 "+count+"개의 빵이 모두 만들어졌습니다.");
	}
	
	void makeBread(int count, String brd) {
		
		for(int i=0; i<count; i++) {
			System.out.println((i+1)+"번째 "+brd+"을(를) 만들었습니다.");
		}
		System.out.println("요청하신 "+count+"개의 "+brd+"이 모두 만들어졌습니다.");
	}
	
	void ordar(int count, String brd) {
		
		Method bread=new Method();
		boolean run=true;
		Scanner scan=new Scanner(System.in);
		
		while(run) {
			System.out.println("1. 빵 갯수 선택 | 2. 빵의 갯수와 종류 | 3. 종료");
			System.out.print("선택 > ");
			int num=scan.nextInt();
			if(num==1) {
				System.out.print("주문할 빵의 갯수 : ");
				count=scan.nextInt();
			if(count<=0) {
				System.out.println("잘못 입력하셨습니다.");
			} else {
				for(int i=0; i<count; i++) {
				System.out.println((i+1)+"번째 빵을 만들었습니다.");
				    }
			        System.out.println("요청하신 "+count+"개의 빵이 모두 만들어졌습니다.");
			}
			} else if(num==2) {
				System.out.print("주문할 빵의 갯수 : ");
				count=scan.nextInt();
				System.out.print("주문할 빵의 종류 : ");
				brd=scan.next();
				for(int i=0; i<count; i++) {
					System.out.println((i+1)+"번째 "+brd+"을(를) 만들었습니다.");
				}
				System.out.println("요청하신 "+count+"개의 "+brd+"이 모두 만들어졌습니다.");
			} else if(num==3) {
				System.out.println("프로그램 종료");
				run=false;
			} else {
				System.out.println("잘못 입력하셨습니다.");
				System.out.println("프로그램 종료");
				run=false;
			}
		}
		
		
	}

}
