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
	super(); //super�� this�� ()�� ������ ������ȣ��, (); ������ġ�� �ִ� �ڱ��ڽ��� ȣ����. �ݵ�� ù��°�ٿ�(first statement)�� ������Ѵ�
	this(); //super�� this�� ���� �� ���� ����. 
	
	System.out.println("���࿡");
	System.out.println("��� �����ڿ��� �������� ó���� ������");
	System.out.println("������ �ִٸ�");
	System.out.println("////////////////////");
	System.out.println("////////////////////");
	System.out.println("////////////////////");
	System.out.println("////////////////////");
 }

public ThisTest4(String name, int age) {
	this();
	ThisTest3 r=new ThisTest3();
	//this(); , ThisTest3 r~�� �� ������� ������ ȣ���� ���� �� �ִ�
	this.name = name;
	this.age = age;
}

 public ThisTest4(String name) {
	//super(); //���� �Ƚ��൵ �� ����Ʈ �����ڰ� �־?
	 this();
	 this.name = name;
}
 public ThisTest4(int age) {
	//super();
	this();
	this.age = age;
}
}

//�ڵ�ȣ�� �޼ҵ��� �����ڴ� ������� ȣ���� �� ����
//������ ȣ��:this�� new(~ ~: new ~)�� ����Ѵ�