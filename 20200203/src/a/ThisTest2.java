package a;
/**
 * this(  )
 * 
 *
 */
public class ThisTest2 {
 private String name;
 private int age;
 
 public ThisTest2() {
	System.out.println();
	
	System.out.println("만약에");
	System.out.println("모든 생성자에서 공통으로 처리할 문장을");
	System.out.println("가지고 있다면");
	System.out.println("////////////////////");
	System.out.println("////////////////////");
	System.out.println("////////////////////");
	System.out.println("////////////////////");
 }

public ThisTest2(String name, int age) {
	this();
	this.name = name;
	this.age = age;
}

 public ThisTest2(String name) {
	//super(); //굳이 안써줘도 됨 디폴트 생성자가 있어서?
	 System.out.println("////////////////////");
	 System.out.println("////////////////////");
	 System.out.println("////////////////////");
	 System.out.println("////////////////////");
	 this.name = name;
}
 public ThisTest2(int age) {
	//super();
	 System.out.println("////////////////////");
	 System.out.println("////////////////////");
	 System.out.println("////////////////////");
	 System.out.println("////////////////////");
	this.age = age;
}
}
