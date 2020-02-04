package b;

public class SubClassDa extends SuperClassDa {
	private String name="기본값";
	private int age=10;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void output() {
		System.out.println("나이:"+age);
		System.out.println("기초의 age:"+super.getAge());
		System.out.println("주소:"+getAddr());
		System.out.println("성별:"+gender);
		}
}
//superclass의 addr이 private이어서 getter/setter를 써야한다
//서브클래스에서 기초클래스의 age를 가져와야 하는경우:super.getAge(); 를 쓴다
