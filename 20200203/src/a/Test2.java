package a;

public class Test2 {
 static private int max; //final �ƴϾ �ҹ���?
 static public final int MIN=13; //final�� �ݵ�� �ʱ�ȭ�� ���������->�ƴϸ� ������
 //static public final int LAST;
 //������� �ʱ�ȭ��ų �� �����ڸ� �� �� ����
 static private final int FIRST; //final�� �����ڶ� ��������. static�� �����ڰ� ������ ���� �޸𸮿� ���� �Ҵ��.
 private final double rate;
 
 static { //static block�� ���� �޼ҵ尡 ����Ǳ� ���� �����
	 max=999;
	 System.out.println("static block");
	 FIRST=MIN/3;
	 //static ���� ���� �ʱ�ȭ��Ű�� �ʹ�->static block����?
	 method();
 }
 public Test2() {
	 max=789;
	 System.out.println("������");
	 rate = MIN*9.9; //final�� �������� ��, �ʱ�ȭ�� �������.(�ʱ갪 �ֱ�)
	 //�ƴϸ� ������ �ڸ����� ����Ŀ� ���� ���� �־��൵ ��.
	// FIRST=1;
	 // LAST=31;
	//������: �ν��Ͻ��� ��������� �������� �� ó�� �ؾ��ϴ� logic�� ������ �ִ� ��. ������ ȣ���� �Ǿ����� ������ ó���� ������ ������ �ִ� ��.
	
 }
 static public void method() { //ȣ���� ���ؼ� ����� �ȵ�
	 System.out.println("static�� method");
 }
 public static void main(String[] args) { //���α׷� ���۰� ���� �˸��� �޼ҵ� //����
		// TODO Auto-generated method stub
	max = 79;
//	System.out.println("main () method");
	}//��

}
