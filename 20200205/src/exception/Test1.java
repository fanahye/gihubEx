package exception;

import java.io.IOException;
import java.io.InputStream;

public class Test1 {

	public static void main(String[] args) throws IOException{ //���ѱ� �� �ִٴ� �ǹ�. runtimeException�� �ƴ�.
		// TODO Auto-generated method stub
	InputStream stream = System.in;
	System.out.print("�Է��ϼ���: ");
		int data = stream.read(); //�� �޼ҵ忡�� ó��x throw�ؼ� ���ѱ��~ throws�� �������. ��� �ѱ�� ����. �׷��� ������ �����������? ó���ؾ���!
		//IOException : io->�Է°� ����� �ϰ� �ִ� ����. ����,Ŭ���ϸ� ����. ���θ޼ҵ� ������������ ó������� ��.
	System.out.println("�Է¹��� ������ => "+data);
	}

}
