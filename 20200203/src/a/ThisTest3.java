package a;
/**
 * this(  )
 * 
 *
 */
public class ThisTest3 {
 private String name;
 private int age;
 
 public ThisTest3() {
	System.out.println("만약에");
	System.out.println("모든 생성자에서 공통으로 처리할 문장을");
	System.out.println("가지고 있다면");
	System.out.println("////////////////////");
	System.out.println("////////////////////");
	System.out.println("////////////////////");
	System.out.println("////////////////////");
 }

public ThisTest3(String name, int age) {
	this(); //this(name); //생성자는 첫번째 ;(세미콜론)이 오는 줄에만 와야한다 그래서 렉나는 거. this();랑 같이 쓸 수 x
	//ThisTest3 r=new ThisTest3();
	//this(); , ThisTest3 r~이 두 방법으로 생성자 호출을 해줄 수 있다
	this.name = name;
	this.age = age;
}

 public ThisTest3(String name) {
	//super(); //굳이 안써줘도 됨 디폴트 생성자가 있어서?
	 this();
	 this.name = name;
}
 public ThisTest3(int age) {
	//super();
	this();
	this.age = age;
}
}

//자동호출 메소드인 생성자는 마음대로 호출할 수 없다
//생성자 호출:this나 new(~ ~: new ~)를 써야한다