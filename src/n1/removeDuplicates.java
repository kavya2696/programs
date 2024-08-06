package n1;

public class removeDuplicates {
	public static int removeDuplicatedinSortedArray(int[] nums) {
		int j=1;
		for(int i=1;i<nums.length;i++) {
			if(nums[i] != nums[i-1]) {
				nums[j++]=nums[i];
			}
		}
		return j;
			
	}

	public static void main(String[] args) {
		int[] nums = {0,0,1,1,2,3,3,4};
		int count=removeDuplicatedinSortedArray(nums);
		System.out.println("Count:"+count);
		for(int i=0;i<count;i++) {
			System.out.print(nums[i]+ " ");
		}
	}
}
