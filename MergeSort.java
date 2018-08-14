
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
        //Complexity of NlogN
	public List<Integer> ms(List<Integer> input) {
		if(input.size() <= 1)
			return input;
		int index = input.size()/2;
		List<Integer> left = new ArrayList();
		List<Integer> right = new ArrayList();
		//logN Complexity
		for(Integer a : input) {
			if(a.intValue() <= input.get(index)) {
				left.add(a);
			} else {
				right.add(a);
			}				
		}
		left = ms(left);
		right = ms(right);
		return merge(left, right);
	}
	
	public List<Integer> merge(List<Integer> left, List<Integer> right) {
		List<Integer> result = new ArrayList();
		Integer i = 0;
		//N Complexity
		while(i < left.size()) {
			if(left.get(i) <= right.get(i)) {
				result.add(left.get(i));
				left.remove(left.get(i));
			} else {
				result.add(right.get(i));
				right.remove(right.get(i));
			}
		}
		if(left.size() > 0)
			result.addAll(left);
		if(right.size() > 0)
			result.addAll(right);
		return result;
	}
	
	public static void main(String args[]) {
		Integer[] a = {Integer.valueOf(5),Integer.valueOf(3),Integer.valueOf(1)};
		MS ms = new MS();
		List<Integer> sorted = ms.ms(Arrays.asList(a));
		System.out.println(sorted);
	}
}

