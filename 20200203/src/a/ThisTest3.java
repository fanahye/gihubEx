package a;
/**
 * this(  )
 * 
 *
 */
public class ThisTest3 {
 private String name;
 private int age;
 
 public ThisTest3() {
	System.out.println("���࿡");
	System.out.println("��� �����ڿ��� �������� ó���� ������");
	System.out.println("������ �ִٸ�");
	System.out.println("////////////////////");
	System.out.println("////////////////////");
	System.out.println("////////////////////");
	System.out.println("////////////////////");
 }

public ThisTest3(String name, int age) {
	this(); //this(name); //�����ڴ� ù��° ;(�����ݷ�)�� ���� �ٿ��� �;��Ѵ� �׷��� ������ ��. this();�� ���� �� �� x
	//ThisTest3 r=new ThisTest3();
	//this(); , ThisTest3 r~�� �� ������� ������ ȣ���� ���� �� �ִ�
	this.name = name;
	this.age = age;
}

 public ThisTest3(String name) {
	//super(); //���� �Ƚ��൵ �� ����Ʈ �����ڰ� �־?
	 this();
	 this.name = name;
}
 public ThisTest3(int age) {
	//super();
	this();
	this.age = age;
}
}

//�ڵ�ȣ�� �޼ҵ��� �����ڴ� ������� ȣ���� �� ����
//������ ȣ��:this�� new(~ ~: new ~)�� ����Ѵ�