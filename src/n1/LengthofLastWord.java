package n1;

public class LengthofLastWord {
	public int findLastWordLength(String s1) {
		int count=0;
		for(int i=s1.length()-1;i>=0;i--) {
			if(s1.charAt(i) != ' ') {
				count++;
			}
			else if(count>0) {
				break;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		String s1="   fly me   to   the moon  ";
		LengthofLastWord length=new LengthofLastWord();
		int lengthVal =length.findLastWordLength(s1);
		System.out.println("Length:" + lengthVal);
		
		
	}

}
