package n1;

public class buySellStock {
 public int bestTime(int[] nums) {
	 int minPrice=nums[0];
	 int profit=0;
	 for(int i=1;i<nums.length;i++) {
		 if(nums[i]<minPrice) {
			 minPrice=nums[i];
		 }
		 else
			 profit=Math.max(profit,nums[i]-minPrice);
	 }
	 return profit;
 }
 
 public static void main(String[] args) {
	 int[] n= {7,6,4,3,1};
	 buySellStock bs=new buySellStock();
	 int profit= bs.bestTime(n);
	 System.out.println("Profit="+profit);
	 
	 
	
}
}
