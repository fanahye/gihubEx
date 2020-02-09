package exception;

public class ThrowTest1 { // ���� exception ���� ���� �� �ڵ鸵 ����
	private int a;
	private int b;
	private int c;

	public ThrowTest1(int a, int b) {
		this.a = a;
		this.b = b;
	}

	// throw new Exception(); //runtimeException���� �Ļ����� ���� ���� ��� checked exception�̴�
	public int calc(int a, int b) throws ArithmeticException, Exception { // public int calc() ���� ó��: return 0;
		if (a == 0) {
		throw new Exception("0�� �ƴ� ���� �Է��ϼ���");
		}
		return a / b;

	}
	public void init() {
		try {
			c = calc(a,b);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (Exception e) {
		  System.out.println(e.getMessage());
	}
	}

	public void output() {
		System.out.println(a+"/"+b+"="+c);
	}
}
