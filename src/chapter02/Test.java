package chapter02;

public class Test {

	public static void main(String[] args) {
 
		
		
		//1번
		
		byte bNum=25;
		int iNum=bNum;
		
		System.out.println("1번 : "+iNum);
		
		//2번
		double dNum1=1.2; 
		float fNum1=0.9f;
		
		int iNum2=(int)(dNum1+fNum1);
		int iNum3=(int)dNum1+(int)fNum1;
		//3번
		System.out.println("4번 : 부동소수점");
	     
		
		//4번 
		
		int iNum4=10;
		float fNum2=2.5f;
		
		int iNum5=(int)(iNum4+fNum2);
		System.out.println("4번 : "+iNum3);
		
		//5번
		
		char ch1='\uAE00';
		System.out.println("5번 : "+ch1);
	}
}
