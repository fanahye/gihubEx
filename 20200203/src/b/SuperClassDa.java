package b;

public class SuperClassDa {
	private int age=99;
	private String addr="������ �Ｚ��";
	protected char gender='m';
	public void m1() {
		System.out.println("Super�� m1() age"+age+" addr:"+addr);
	}
	public int getAge() {
		return age; //age�տ� this�� ���� �Ͱ� ����
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
