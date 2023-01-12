package chapter05;

import javax.swing.JOptionPane;

public class FunTest01 {
	
	//합계 메소드(함수)
	//접근한정자 : public(공용) / protected(패키지 안에서만 공용)
	//private(클래스 안에서만 사용)
	//void : return 없음
//	public static void sum(int n, int n1) {
//		int total=n+n1;
//		System.out.println(total);
//	}

	public static void main(String[] args) {
		
		int a,b;
		a=Integer.parseInt(JOptionPane.showInputDialog("값1"));
		b=Integer.parseInt(JOptionPane.showInputDialog("값2"));
		
		sum(a,b);

	}
	//메인을 기준으로 하여 메인선언 전 또는 후에 정의해도 됨
	public static void sum(int n, int n1) {
		int total=n+n1;
		System.out.println(total);
	}
	

}
