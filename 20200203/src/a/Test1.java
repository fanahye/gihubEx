package a;

public class Test1 {
	
	private int age; //인스턴스가 만들어지기전에 모름. 숨겨져 있기 때문에...
	//같은 멤버끼리는 인식됨 
	
//static: 인스턴스가 만들어지기 전에 인식됨
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//age=10; int age가 private라서  ㄴㄴ
		Test1 test1 = new Test1();
		test1.age=10;

	}

}
