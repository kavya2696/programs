package n1;

public class ProductExceptSelf {
	
	public int[] findProductExceptSelf(int[] nums) {
		int n=nums.length;
		int[] result=new int[n];
		result[0]=1;
		for(int i=1;i<n;i++) {
			result[i]=result[i-1]*nums[i-1];
		}
		int rightProduct=1;
		for(int i=n-1;i>=0;i--) {
			result[i]=result[i]*rightProduct;
			rightProduct=rightProduct*nums[i];
		}
		return result;
		
	}

	public static void main(String[] args) {
		int[] nums= {-1,1,0,-3,3};
		ProductExceptSelf product=new ProductExceptSelf();
		int[] val=product.findProductExceptSelf(nums);
		for(int i=0;i<nums.length;i++) {
			System.out.print(val[i] + " ");
		}
	}
}
