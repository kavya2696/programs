package n1;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
	public int romantointconverter(String s1) {
		Map<Character,Integer> map=new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		int result=map.get(s1.charAt(s1.length()-1));
		
		for(int i=s1.length()-2;i>=0;i--) {
			if(map.get(s1.charAt(i)) < map.get(s1.charAt(i+1))) {
				result = result - map.get(s1.charAt(i));
			}
			else
				result = result + map.get(s1.charAt(i));
		}
		return result;
	}
	
	public static void main(String[] args) {
		String roman="IX";
		RomanToInt intval=new RomanToInt();
		int number=intval.romantointconverter(roman);
		System.out.println("Roman number: " + roman + " Integer: " + number);
	}

}
