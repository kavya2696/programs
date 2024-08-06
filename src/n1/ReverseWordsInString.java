package n1;

public class ReverseWordsInString {
	public String reverseWordsinSentence(String s) {
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		s = sb.toString();
		
		int start=0;
		int n=s.length();
		int i=0;
		sb=new StringBuilder();
		
		while(i<n) {
			while(i < n && s.charAt(i) == ' ')
				i++;
			start=i;
			while(i < n && s.charAt(i) != ' ')
				i++;
			if(start < i) {
				StringBuilder reverseWord=new StringBuilder(s.substring(start,i));
				reverseWord.reverse();
				sb.append(reverseWord);
				sb.append(' ');
			}
			
		}
		if(sb.length() > 0) {
			sb.setLength(sb.length()-1);
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		String s1="  This is   blue   ";
		ReverseWordsInString rs=new ReverseWordsInString();
		String reverse=rs.reverseWordsinSentence(s1);
		System.out.println(reverse);	
		
	}

}
