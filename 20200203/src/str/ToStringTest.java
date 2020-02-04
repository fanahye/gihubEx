package str;

public class ToStringTest {
	private String name;
	private int age;
	public ToStringTest() {
		
	}
	public ToStringTest(String name, int age) {
	this.name = name;
	this.age = age;
}
	@Override
	public String toString() {
		return "ToStringTest [name=" + name + ", age=" + age + "]"; //setter/getter를 만드는 것처럼 자주 만들게 될 것..오버라이딩..
	}
}
