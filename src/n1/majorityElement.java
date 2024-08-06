package n1;

public class majorityElement {
	public static void majority(int[] nums) {
		int elem=nums[0];
		int count=0;
		for( int n:nums) {
			if(count == 0) {
				elem=n;
				
			}
			if(elem==n) {
				count++;
			}
			else {
				count--;
			}
		}
		System.out.println("Majority: " +elem);
	}
	
	public static void main(String[] args) {
		int[] n1= {2,2,1,1,1,2,2};
		majority(n1);
	}

}
