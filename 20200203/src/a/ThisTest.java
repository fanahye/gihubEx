package a;

public class ThisTest {
	private String name;
	private int age;
	
	public ThisTest() {
		System.out.println("�ν��Ͻ� ������ġ:"+this.hashCode());
	}
	public ThisTest(String  name) { //�����ڸ� �޾��ִ� ��
	this.name = name; //this.�� ���ٸ� ���� ���� �޼ҵ� name 3���� ���� ��. �������� ������ ���� . ���� �� ������ ���� ��������� �Ķ���ͺ��� ������ ���� this�� �ٿ���? 
	}
	public ThisTest(String n, int a) { //n�� �ڸ��ڰ� ����. name�� �� �޼ҵ忡 ������ �� �޼ҵ忡 ���� ã�´�.
		name=n;
		age=a;
		System.out.println("�ν��Ͻ� ������ġ:"+this.hashCode());
	}
	public void output() {
		System.out.println("out()�� ȣ���� �ν��Ͻ� ��ġ:"+this.hashCode()+"�ν��Ͻ��� age:"+age+"�̸�:"+name);
	}
		

}
