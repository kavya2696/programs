package n1;

public class t1 {
	public int hIndex(int[] citations) {
        int n=citations.length;
        int count=0;
        int[] buckets=new int[n+1];
        for(int c:citations){
            if(c >= n){
                buckets[n]++;
            }
            else{
                buckets[c]++;
            }
        }
        for(int i=n; i>=0; i--){
            count=count+buckets[i];
            if(count >= i){
                return i;
            }
        }
        return 0;
    }
	public static void main(String[] args) {
		int[] nums= {3,0,6,1,5};
		int k=2;
		t1 ra=new t1();
		ra.hIndex(nums);
	}
}
