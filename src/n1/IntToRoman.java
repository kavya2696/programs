package n1;

public class IntToRoman {
	public String inttoromanconverter(int num) {
		String roman="";
		int[] storeInt= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String[] storeRoman= {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		for(int i=0;i<storeInt.length;i++) {
			while(num>=storeInt[i]) {
				roman=roman+storeRoman[i];
				num=num-storeInt[i];
			}
		}
		return roman;
		
	}
	public static void main(String[] args) {
		int intVal=11;
		IntToRoman intValObj=new IntToRoman();
		String roman=intValObj.inttoromanconverter(intVal);
		System.out.println("Integer number: " + intVal + " Roman: " + roman);
	}
}
