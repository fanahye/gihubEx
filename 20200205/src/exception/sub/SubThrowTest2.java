package exception.sub;

import exception.MyException;
import exception.ThrowTest2;

public class SubThrowTest2 extends ThrowTest2 {

	public SubThrowTest2(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}
	@Override
	public int calc(int a, int b) throws ArithmeticException, MyException, Exception { 
		//서브클래스에서는 throws가 없으면 Exception을 만들 수 없다(오버라이딩 할 때)
		return 0; //기초클래스에 있는 Exception을 서브클래스에서도 사용하려면 기초클래스 Exception을 유지해야 한다
	}
	@Override
	public void init() throws Exception { 
		//서브클래스에서는 exception을 생략해도 된다. Exception들의 기초 클래스는 Exception이다
		//지금은 처리 문장이 중요하지 않음. 오버라이드시 throws 부분에 대한 규칙을 보면 됨. 연산식->중요하지 않음....
		super.init();
		
}

	
	}

