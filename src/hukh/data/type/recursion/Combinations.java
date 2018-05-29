package hukh.data.type.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combinations {
	
	/**
	 * Generates all combinations and output them.
	 * selecting n elements from data
	 * @param selected
	 * @param data	
	 * @param n	
	 */
	public void combination(List<Integer> selected, List<Integer> data, int n) {
		// smaller than 0,should by retured
		if (n < 0) {
			return;
		}
		
		if (n == 0)
		{
			for (Integer i : selected) {
				System.out.print(i);
				System.out.print(" ");
			}
			System.out.println();
			return;
		}
		
		if (data.isEmpty()) {
			return;
		}
		
		// select element 0
		selected.add(data.get(0));
		combination(selected, data.subList(1, data.size()), n-1);
		
		// non-select element 0
		selected.remove(selected.size()-1);
		combination(selected, data.subList(1, data.size()), n);
	}
	
	public static void main(String[] args) {
		Combinations comb = new Combinations();
		comb.combination(new ArrayList<>(), Arrays.asList(1,2,3,4), 2);
		System.out.println("======================");
		comb.combination(new ArrayList<>(), Arrays.asList(1,2,3,4), -1);
		System.out.println("======================");
		comb.combination(new ArrayList<>(), Arrays.asList(1,2,3,4), 0);
		System.out.println("======================");
	}
}
