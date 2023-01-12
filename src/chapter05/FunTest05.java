package chapter05;

import java.util.Scanner;

public class FunTest05 {
	
	public String channel; //멤버변수
	public int channelInt; //멤버변수
	public int volume; //멤버변수
	
	//생략가능
	public FunTest05() {
		
	}
	
	public void channelUP(int volume) {
		System.out.println("소리를 "+volume+"만큼 올립니다.");
		
	}
	
	public void channelDown(int volume) {
		System.out.println("소리를 "+volume+"만큼 내립니다.");
	}
	
	//오버로딩(다형성 만족)
	public void channelChange(String channel) {
		System.out.println("TV 채널을 "+channel+"로 바꿉니다.");
	}
	
	//오버로딩(다형성 만족)
    public void channelChange(int channelInt) {
    	System.out.println("채널을 "+channelInt+"로 바꿉니다.");
	}
	
//=====================================================
	public static void main(String[] args) {
		
		boolean run=true;
		FunTest05 tv=new FunTest05();
		Scanner scan=new Scanner(System.in);
		int v1=0;
		
		while(run) {
			
			System.out.println("===========================================================");
			System.out.println("1.Volume Up | 2.Volume Down | 3.TV channel | 4.channel");
			System.out.println("===========================================================");
			System.out.print("입력 > ");
			int num=scan.nextInt();
			
			if(num==1) {
				System.out.print("소리를 몇 만큼 올리시겠습니까 ? : ");
				v1=scan.nextInt();
				tv.channelUP(v1);
				if(v1<=0) {
					System.out.println("잘못 입력하셨습니다.");
					System.out.println("프로그램을 종료합니다.");
					run=false;
				}
			} 
			
		}
		

	}

}
