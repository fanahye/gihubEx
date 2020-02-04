package a;
/**
 * this(  )
 * 
 *
 */
public class ThisTest4 {
 private String name;
 private int age;
 
 public ThisTest4() {
	super(); //super든 this든 ()가 있으면 생성자호출, (); 같은위치에 있는 자기자신을 호출함. 반드시 첫번째줄에(first statement)에 써줘야한다
	this(); //super와 this는 같이 쓸 수가 없다. 
	
	System.out.println("만약에");
	System.out.println("모든 생성자에서 공통으로 처리할 문장을");
	System.out.println("가지고 있다면");
	System.out.println("////////////////////");
	System.out.println("////////////////////");
	System.out.println("////////////////////");
	System.out.println("////////////////////");
 }

public ThisTest4(String name, int age) {
	this();
	ThisTest3 r=new ThisTest3();
	//this(); , ThisTest3 r~이 두 방법으로 생성자 호출을 해줄 수 있다
	this.name = name;
	this.age = age;
}

 public ThisTest4(String name) {
	//super(); //굳이 안써줘도 됨 디폴트 생성자가 있어서?
	 this();
	 this.name = name;
}
 public ThisTest4(int age) {
	//super();
	this();
	this.age = age;
}
}

//자동호출 메소드인 생성자는 마음대로 호출할 수 없다
//생성자 호출:this나 new(~ ~: new ~)를 써야한다