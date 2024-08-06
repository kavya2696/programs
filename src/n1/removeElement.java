package n1;

public class removeElement {
	public int removeElement(int[] nums,int value) {
		int j=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i] != value) {
				nums[j++] = nums[i];
			}
		}
		return j;
		
		
	}
	
	public static void main(String[] args) {
		int[] nums= {3,2,2,3};
		int value = 3;
		int count=0;
		removeElement re= new removeElement();
		count = re.removeElement(nums,value);
		System.out.println("Count: "+ count);
		System.out.println("Array");
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}
}
