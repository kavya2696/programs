package n1;

public class jumpGame {
	public boolean jumpgame(int[] nums) {
		int reachable=0;
		for(int i=0;i<nums.length;i++) {
			if(i>reachable)
				return false;
			reachable=Math.max(reachable, i+nums[i]);
			
			
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[] nums= {3,2,1,0,4};
		jumpGame jg = new jumpGame();
		boolean val=jg.jumpgame(nums);
		System.out.println("Jump is:" + val);
	}
}
