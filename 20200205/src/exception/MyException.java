package exception;

public class MyException extends Exception {
 
	public MyException() {
	 super("수를 0을 입력해서 발생한 예외상항");
 }
 public MyException(String msg) {
	 super(msg);
}
}