package practice;

import java.util.HashMap;
import java.util.Map;

public class CountPairs {

	public int countPairs(int k, int[]a){
		int count=0;
		Map<Integer,Integer> map= new HashMap<Integer,Integer>();
		for(int i:a){
			if(map.containsKey(i)){
				map.put(i, map.get(i)+1);
			}
			else{
				map.put(i, 1);
			}
		}
		for(int i:a){
			int complement=k-i;
			if(map.containsKey(complement)){
				count+=map.get(complement);
				if(complement==i)count--;
			}
		}
		return count/2;
	}
	public static void main(String[] args) {
		CountPairs p=new CountPairs();
		int[]a={10, 12, 10, 15, -1, 7, 6,5, 4, 2, 1, 1, 1};
		System.out.println(p.countPairs(11, a));
	}

}
