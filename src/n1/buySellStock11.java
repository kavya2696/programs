package n1;

public class buySellStock11 {
	public int bestTime(int[] nums) {
		// 3 6 8 1
		int profit=0;
		for(int i=1;i<nums.length;i++) {
			if(nums[i]>nums[i-1]) {
				profit=profit+(nums[i]-nums[i-1]);
				
			}
			
		}
		return profit;
		
	}
	public static void main(String[] args) {
		 int[] n= {7,1,5,3,6,4};
		 buySellStock11 bs=new buySellStock11();
		 int profit= bs.bestTime(n);
		 System.out.println("Profit="+profit);
		 
		 
		
	}
	}
