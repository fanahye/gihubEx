package use;

import str.Test1;

public class StrTest1Use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t1 = new Test1();
		Test1 t2 = new Test1();
		
		System.out.println(t1);
		System.out.println(t2.toString()); //String���� �ٲٷ��� 
		System.out.println(t2);

		String ref = t2.toString(); 
		//t2�� ���� ������. toString();�� ���� ��. println������ �ڵ����� string���� ��������� ?
		//��������� ������ �ִ� �����͸� �����س�����->�α����Ͽ���...
	}

}
