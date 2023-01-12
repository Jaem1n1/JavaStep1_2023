package chapter05;

public class FunTest_OverloadingMain {

	public static void main(String[] args) {
		
		FunTest_Overloading obj=new FunTest_Overloading();
		obj.getReult(1);
		obj.getReult('o');
		obj.getReult("one");
		obj.getReult(1,'o', "one");

	}

}
