package a;

public class Test2 {
 static private int max; //final 아니어서 소문자?
 static public final int MIN=13; //final은 반드시 초기화를 시켜줘야함->아니면 에러남
 //static public final int LAST;
 //멤버변수 초기화시킬 때 생성자를 쓸 수 있음
 static private final int FIRST; //final은 생성자랑 쓰지마라. static은 생성자가 나오기 전에 메모리에 먼저 할당됨.
 private final double rate;
 
 static { //static block은 메인 메소드가 실행되기 전에 실행됨
	 max=999;
	 System.out.println("static block");
	 FIRST=MIN/3;
	 //static 변수 값을 초기화시키고 싶다->static block에서?
	 method();
 }
 public Test2() {
	 max=789;
	 System.out.println("생성자");
	 rate = MIN*9.9; //final은 변수선언 시, 초기화를 해줘야함.(초깃값 넣기)
	 //아니면 생성자 자리에서 연산식에 의해 값을 넣어줘도 됨.
	// FIRST=1;
	 // LAST=31;
	//생성자: 인스턴스가 만들어지는 시점에서 맨 처음 해야하는 logic을 가지고 있는 것. 스스로 호출이 되어져서 스스로 처리할 문장을 가지고 있는 것.
	
 }
 static public void method() { //호출을 안해서 출력이 안됨
	 System.out.println("static한 method");
 }
 public static void main(String[] args) { //프로그램 시작과 끝을 알리는 메소드 //시작
		// TODO Auto-generated method stub
	max = 79;
//	System.out.println("main () method");
	}//끝

}
