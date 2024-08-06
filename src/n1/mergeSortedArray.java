package n1;

public class mergeSortedArray {
	 public void mergeSort(int[] num1,int m, int[] num2, int n){
	  int i=m-1;
	  int j=n-1;
	  int k=m+n-1;
	  while(j>=0) {
		  if(i>=0 && num1[i] > num2[j]) {
			  num1[k--] = num1[i--];
		  }
		  else
			  num1[k--] = num2[j--];
	  }
	  
	}
	
	public static void main(String[] args) {
		int[] num1= {1,3,5,0,0,0};
		int[] num2= {2,8,13};
		mergeSortedArray obj1= new mergeSortedArray();
		int m=3;
		int n=3;
		obj1.mergeSort(num1,m,num2,n);
		for(int i=0;i<num1.length;i++) {
			System.out.println(num1[i]);
		}
		
		
	}
}
