package use;

import a.ThisTest;

public class ThisTestUse {

	public static void main(String[] args) {
	ThisTest ref1 = new ThisTest(); //�ν��Ͻ��� �����Ѵ�. ref�� ������ġ�� �����. this=ref�� ����.
	ThisTest ref2 = new ThisTest("�踻��",90);
	ThisTest ref3 = new ThisTest("�ڸ���",10);
	ThisTest ref4 = new ThisTest("������");
	System.out.println("ref1��  �����ϴ� �ν��Ͻ��� �ּ�:"+ref1.hashCode()); //hashCode:�ּҰ�
	System.out.println("ref2��  �����ϴ� �ν��Ͻ��� �ּ�:"+ref2.hashCode());
	System.out.println("ref3��  �����ϴ� �ν��Ͻ��� �ּ�:"+ref3.hashCode());
	ref1.output();
	ref2.output();
	ref3.output();
	ref4.output();
	}
}
