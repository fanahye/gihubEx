package use;

import exception.ThrowTest2;

public class ThrowsTest2Use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ThrowTest2 test2 = new ThrowTest2(0, 1);
	try {
	System.out.println(test2.calc(4,0)); //calc �޼ҵ带 ���θ޼ҵ�(ThrowsTest2)���� ȣ���ϰ� ����
	}catch(ArithmeticException e) {
	 System.out.println(ThrowsTest2Use.class+ "0���� ������ �ȵȴ�"); //�̰� �Ⱦ���
	}catch (Exception e) {
	 System.out.println("�˼� ���� ���� ����"); //��Խ��ϴ�. �Ⱦ��� ã�Ⱑ ���� ���ִ� ���� ������...������..�����̴ϱ�..��
	}

}
}
