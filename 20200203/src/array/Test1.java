package array;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = new int[5 ];
		//nums[0] = 0; nums[1] = 0;
		//nums[2] = 0; nums[3] = 0;
		//nums[4] = 0; nums[5] = 0; //이렇게 하면 코드양이 넘 많고 번거로워서 ㄴㄴ
		
		for(int i = 0 ; i< nums.length; i++) {
			nums[i]=10;
		}
		for(int i = 0 ; i< nums.length; i++) {
			System.out.println(nums[i]);
		
	}

}
}
