package chapter05;

import javax.swing.JOptionPane;

public class FunTest04 {
	
	public static void Display(String A[]) {
		String res="";
		
		for(int i=0; i<A.length; i++) {
			res+=A[i]+" ";
		}
		System.out.println(res);
		JOptionPane.showMessageDialog(null,"배열의 원소값\n\n"+ res);
	}

	public static void main(String[] args) {
		String str[] = {"Java","Oracle","Html5,CSS,JS,JQ","JSP","Spring","PythonCamp"};
		
		Display(str);

	}

}
