package n1;

public class GasStation {
	public int canCompleteCircle(int[] gas, int[] cost) {
		int position=0,total=0,sum=0;
		for(int i=0;i<gas.length;i++) {
			sum=sum+gas[i]-cost[i];
			if(sum<0) {
				total=total+sum;
				sum=0;
				position=i+1;
			}
		}
		total=total+sum;
		return total>=0?position:-1;
	}
	public static void main(String[] args) {
		int[] gas= {1,2,3,4,5};
		int[] cost= {3,4,5,1,2};
		GasStation gs=new GasStation();
		int position=gs.canCompleteCircle(gas,cost);
		System.out.println("Position: " + position);
	}
}
