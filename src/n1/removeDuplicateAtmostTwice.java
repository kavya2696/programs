package n1;

public class removeDuplicateAtmostTwice {
	public static int removeDuplicateAtmostTwice(int[] nums) {
		int j=1;
		for(int i=1;i<nums.length;i++) {
			if(j==1 || nums[i] != nums[j-2]) {
				nums[j++]=nums[i];
			}
		}
		return j;
	}
	public static void main(String[] args) {
		int[] nums= {1,1,1,2,2,3};
		int count=removeDuplicateAtmostTwice(nums);
		System.out.println("Count:"+count);
		for(int n:nums) {
			System.out.println(n);
		}
	
	}

	
}
