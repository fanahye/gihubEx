package exception;

public class ThrowTest2 { // 여러 exception 쓰면 여러 개 핸들링 가능
	private int a;
	private int b;
	private int c;

	public ThrowTest2(int a, int b) {
		this.a = a;
		this.b = b;
	}

	// throw new Exception(); //runtimeException에서 파생되지 않은 것은 모두 checked exception이다
	public int calc(int a, int b) throws Exception { // public int calc() 에러 처리: return 0;
		if (a == 0) {
		throw new Exception("0이 아닌 수를 입력하세요");
		}
		return a / b;

	}
	public void init() {
		try {
			c = calc(a,b);
		} catch (ArithmeticException e) {
			System.out.println("예외 발생 원인과 어떻게 현 상황을 벗어 날 수 있는지 유도하는 문장과 처리할 수 있는 문장을 기술한다.");
		} catch(MyException e) {
			System.out.println("nyanyanatanatafnd");
		} 
		catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());

	}

	}

	public void output() {
		System.out.println(a+"/"+b+"="+c);
	}
}
