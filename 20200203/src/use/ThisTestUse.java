package use;

import a.ThisTest;

public class ThisTestUse {

	public static void main(String[] args) {
	ThisTest ref1 = new ThisTest(); //인스턴스를 참조한다. ref는 시작위치를 기억함. this=ref값 같음.
	ThisTest ref2 = new ThisTest("김말자",90);
	ThisTest ref3 = new ThisTest("박말자",10);
	ThisTest ref4 = new ThisTest("성말자");
	System.out.println("ref1이  참조하는 인스턴스의 주소:"+ref1.hashCode()); //hashCode:주소값
	System.out.println("ref2이  참조하는 인스턴스의 주소:"+ref2.hashCode());
	System.out.println("ref3이  참조하는 인스턴스의 주소:"+ref3.hashCode());
	ref1.output();
	ref2.output();
	ref3.output();
	ref4.output();
	}
}
