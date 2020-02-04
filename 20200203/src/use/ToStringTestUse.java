package use;

import str.Test1;
import str.ToStringTest;

public class ToStringTestUse {

	public static void main(String[] args) {
		ToStringTest tt1 = new ToStringTest();
		ToStringTest tt2 = new ToStringTest("최말자", 18);
		Test1        test1 = new Test1();
		System.out.println(tt1); //System.out.println(tt1.toString()); 과 동일한 것
		System.out.println(tt2); 
		System.out.println(test1);
		
	}
}
