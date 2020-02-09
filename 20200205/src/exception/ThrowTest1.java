package exception;

public class ThrowTest1 { // 여러 exception 쓰면 여러 개 핸들링 가능
	private int a;
	private int b;
	private int c;

	public ThrowTest1(int a, int b) {
		this.a = a;
		this.b = b;
	}

	// throw new Exception(); //runtimeException에서 파생되지 않은 것은 모두 checked exception이다
	public int calc(int a, int b) throws ArithmeticException, Exception { // public int calc() 에러 처리: return 0;
		if (a == 0) {
		throw new Exception("0이 아닌 수를 입력하세요");
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
