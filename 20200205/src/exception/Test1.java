package exception;

import java.io.IOException;
import java.io.InputStream;

public class Test1 {

	public static void main(String[] args) throws IOException{ //떠넘길 수 있다는 의미. runtimeException이 아님.
		// TODO Auto-generated method stub
	InputStream stream = System.in;
	System.out.print("입력하세요: ");
		int data = stream.read(); //이 메소드에선 처리x throw해서 떠넘긴다~ throws는 연쇄반응. 계속 넘길수 있음. 그러나 메인이 끝나기까지는? 처리해야함!
		//IOException : io->입력과 출력을 하고 있는 상태. 엔터,클릭하면 끝남. 메인메소드 가기전까지는 처리해줘야 함.
	System.out.println("입력받은 데이터 => "+data);
	}

}
