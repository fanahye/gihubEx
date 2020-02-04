package array;

public class Test2 {

	public static void main(String[] args) {
		Test3 [] test3s = new Test3[3]; //인스턴스를 잡기위한 변수가 3개잡혔다,,그것을 test3s가 참조합니다,,,몇개를 만들 것인지 생각하고 들어가야함,,,!!
		/*test3s[0] = new Test3("aaa","dddd");
		test3s[1] = new Test3("aaa","dddd");
		test3s[2] = new Test3("aaa","dddd");*/
		for(int i=0; i< test3s.length; i++) {
			test3s[i] = new Test3("aaa","dddd");
			
		}
		
		System.out.println( test3s[2] ); 
	}
}
class Test3{
	String name;
	String addr;
	
	public Test3 (String name, String addr) {
		super();
		this.name = name;
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		return "Test3 [name=" + name + ", addr=" + addr + "]";
	}
	
}