package a;

public class ThisSuperGeneMethodTest2 extends MySuper{
		 public ThisSuperGeneMethodTest2() {
			out();
		 }
		 public ThisSuperGeneMethodTest2(String str, int n) {
		 forOut(str,n);
		 }
		 public ThisSuperGeneMethodTest2(String str) {
		super(1,2);
		 out();
		 forOut("KimMalja","KimMalja".length());
		 }
		
	 private void out() {
		 System.out.println("&&&&&&&&&&&&&&&");
		 System.out.println("********************");
}
	 private void forOut(String str, int n) {
		 for(int i=1; i<=n; i++) {
			System.out.println(str);  
		 
	 }
	 }
}
	 
	// �޼ҵ带 ����� ����ϴ� ����: �ߺ��ڵ带 ���ϱ� ���ؼ�
