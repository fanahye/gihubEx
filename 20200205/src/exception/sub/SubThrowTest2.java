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
		//����Ŭ���������� throws�� ������ Exception�� ���� �� ����(�������̵� �� ��)
		return 0; //����Ŭ������ �ִ� Exception�� ����Ŭ���������� ����Ϸ��� ����Ŭ���� Exception�� �����ؾ� �Ѵ�
	}
	@Override
	public void init() throws Exception { 
		//����Ŭ���������� exception�� �����ص� �ȴ�. Exception���� ���� Ŭ������ Exception�̴�
		//������ ó�� ������ �߿����� ����. �������̵�� throws �κп� ���� ��Ģ�� ���� ��. �����->�߿����� ����....
		super.init();
		
}

	
	}

