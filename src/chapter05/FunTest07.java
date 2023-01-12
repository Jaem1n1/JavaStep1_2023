package chapter05;

import java.util.Scanner;

public class FunTest07 {
	
	public FunTest07() {
		// TODO Auto-generated constructor stub
	}
	
	public static void Edustep(int edu) {
		
		
		
		if(edu==1) {
			System.out.println("현재 스터디 단계는 step1 입니다.");
		} else if(edu==2) {
			System.out.println("현재 스터디 단계는 step2 입니다.");
		} else if(edu==3) {
			System.out.println("현재 스터디 단계는 step3 입니다.");
		} else {
			
		}
		
		
	}

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("스터디 단계를 입력해주세요. : ");
		int num=scan.nextInt();
		Edustep(num);
//		System.out.println("현재 스터디 단계는 : "+step);
//		System.out.println("현재 스터디 단계는 : "+s+"입니다.");
		

	}

}
