package n1;

import java.util.*;

public class randomizedSet {
	private Map<Integer,Integer> map;
	private ArrayList<Integer> list;
	
	public randomizedSet() {
		map=new HashMap<>();
		list=new ArrayList<>();	
	}
	
	public boolean searchval(int val) {
		return map.containsKey(val);
	}
	
	public boolean insert(int val) {
		if(searchval(val))
			return false;
		list.add(val);
		map.put(val, list.size()-1);
		return true;
	}
	
	public boolean remove(int val) {
		if(!searchval(val))
			return false;
		int index=map.get(val);
		list.set(index, list.get(list.size()-1));
		map.put(list.get(index), index);
		list.remove(val);
		map.remove(list.size()-1);
		return true;
	}
	
	public int getRandom() {
		Random rand=new Random();
		return list.get(rand.nextInt(list.size()));
	}
	
	public static void main(String[] args) {
		randomizedSet rs= new randomizedSet();
		boolean test=rs.insert(1);
		System.out.println(test);
		boolean test1=rs.remove(2);
		System.out.println(test1);
		boolean test2=rs.insert(2);
		System.out.println(test2);
		int test3=rs.getRandom();
		System.out.println(test3);
	}
}
