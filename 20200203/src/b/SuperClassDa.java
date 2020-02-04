package b;

public class SuperClassDa {
	private int age=99;
	private String addr="강남구 삼성로";
	protected char gender='m';
	public void m1() {
		System.out.println("Super의 m1() age"+age+" addr:"+addr);
	}
	public int getAge() {
		return age; //age앞에 this가 붙은 것과 같다
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}

}
