package n1;

public class hindex {
	public int hindexval(int[] citation) {
		int n=citation.length;
		int count=0;
		int[] bucket=new int[n+1];
		for(int c: citation) {
			if(c >= n) {
				bucket[n]++;
			}
			else
				bucket[c]++;
			
		}
		
		for(int i=n;i>=0;i--) {
			count=count+bucket[i];
			if(count >= i) {
				return i;
			}
		}
		return 0;
		
	}
	
	public static void main(String[] args) {
		int[] nums= {3,0,6,1,5};
		hindex index=new hindex();
		int citation=index.hindexval(nums);
		System.out.println("Citation value :"+ citation);
	}
}
