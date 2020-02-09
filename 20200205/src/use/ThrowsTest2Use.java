package use;

import exception.ThrowTest2;

public class ThrowsTest2Use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ThrowTest2 test2 = new ThrowTest2(0, 1);
	try {
	System.out.println(test2.calc(4,0)); //calc 메소드를 메인메소드(ThrowsTest2)에서 호출하고 있음
	}catch(ArithmeticException e) {
	 System.out.println(ThrowsTest2Use.class+ "0으로 나누면 안된다"); //이거 안쓰면
	}catch (Exception e) {
	 System.out.println("알수 없는 예외 사항"); //욕먹습니다. 안쓰면 찾기가 힘들어서 써주는 것을 권장함...개발은..협업이니까..☆
	}

}
}
