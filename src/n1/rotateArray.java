package n1;

public class rotateArray {
	public void rotatingArray(int[] nums,int k) {
		k=k%nums.length;
		rotateArray(nums,0,nums.length-1);
		rotateArray(nums,0,k-1);
		rotateArray(nums,k,nums.length-1);
		for(int n:nums) {
			System.out.print(n + " ");
		}
	}
	public void rotateArray(int[] n,int l,int r) {
		int temp;
		while(l<=r) {
		temp=n[l];
		n[l]=n[r];
		n[r]=temp;
		l++;
		r--;
		}
	}
	public static void main(String[] args) {
		int[] nums= {6,9,7,1,4,5};
		int k=2;
		rotateArray ra=new rotateArray();
		ra.rotatingArray(nums,k);
	}
}
