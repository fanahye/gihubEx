package repeat;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1~10
		int a=1;
		for(   ;a<=10; a++) { //불규칙적인 반복
			System.out.print(a+"");
		}
		System.out.println("\n for 종료 후 a:"+a); //a는 for문 안에 있어서 가져다 쓸 수x 밖으로 빼내면 쓸 수o
		System.out.println("///////////////");
		int b=1;
		while(b<=10) { //또할래? 잔고확인? 규칙적인 반복할 때 많이 씀..do-while은 한번밖에 안물어봐서? 잘 안씀....!
			System.out.print(b+"");
			b++;
		}
		System.out.println("while 종료 후 b:"+b);
	}

}



