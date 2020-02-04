package use;

import str.Test1;

public class StrTest1Use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t1 = new Test1();
		Test1 t2 = new Test1();
		
		System.out.println(t1);
		System.out.println(t2.toString()); //String으로 바꾸려면 
		System.out.println(t2);

		String ref = t2.toString(); 
		//t2만 쓰면 에러남. toString();을 쓰면 됨. println에서는 자동으로 string으로 연결되지만 ?
		//멤버변수가 가지고 있는 데이터를 추적해나가기->로그파일에서...
	}

}
