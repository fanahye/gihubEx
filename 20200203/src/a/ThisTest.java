package a;

public class ThisTest {
	private String name;
	private int age;
	
	public ThisTest() {
		System.out.println("인스턴스 생성위치:"+this.hashCode());
	}
	public ThisTest(String  name) { //성말자를 받아주는 곳
	this.name = name; //this.가 없다면 변수 여기 메소드 name 3개가 같게 됨. 변수명이 많으면 ㄴㄴ . 맵핑 시 편리성을 위해 멤버변수와 파라미터변수 구분을 위해 this를 붙여라? 
	}
	public ThisTest(String n, int a) { //n은 박말자가 참조. name이 이 메소드에 없으면 위 메소드에 가서 찾는다.
		name=n;
		age=a;
		System.out.println("인스턴스 생성위치:"+this.hashCode());
	}
	public void output() {
		System.out.println("out()을 호출한 인스턴스 위치:"+this.hashCode()+"인스턴스의 age:"+age+"이름:"+name);
	}
		

}
