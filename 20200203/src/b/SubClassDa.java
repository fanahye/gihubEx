package b;

public class SubClassDa extends SuperClassDa {
	private String name="�⺻��";
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
		System.out.println("����:"+age);
		System.out.println("������ age:"+super.getAge());
		System.out.println("�ּ�:"+getAddr());
		System.out.println("����:"+gender);
		}
}
//superclass�� addr�� private�̾ getter/setter�� ����Ѵ�
//����Ŭ�������� ����Ŭ������ age�� �����;� �ϴ°��:super.getAge(); �� ����
