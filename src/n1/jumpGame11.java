package n1;

public class jumpGame11 {
	public int jumpgamesec(int[] nums) {
		int reachable=0;
		int totalJumps=0;
		int lastJumpIndex=0;
		int destination=nums.length-1;
		
		for(int i=0;i<nums.length;i++) {
			reachable=Math.max(reachable, i+nums[i]);
			if(i==lastJumpIndex) {
				lastJumpIndex=reachable;
				totalJumps++;
				if(reachable>=destination){
					return totalJumps;
				}
			}
			
			
		}
		return totalJumps;
	}
	
	public static void main(String[] args) {
		int[] nums= {2,3,0,1,4};
		jumpGame11 jg = new jumpGame11();
		int val=jg.jumpgamesec(nums);
		System.out.println("Jump is:" + val);
	}
}
