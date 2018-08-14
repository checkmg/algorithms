
import java.util.Arrays;
import java.util.List;

public class BubbleSort {

	public List<Integer> sort(List<Integer> input) {
		boolean swapped = false;		
		//n^2 Complexity
		for(int i=0; i < input.size(); i++) {
			if(i != input.size()-1) {
				if(input.get(i) >= input.get(i+1)) {
					Integer temp = input.get(i+1);
					input.set(i+1, input.get(i));
					input.set(i, temp);
					swapped = true;
				}	
			}
		}
		if(swapped) {
			input = sort(input);
		}
		return input;
	}
	
	public static void main(String args[]) {
		Integer[] a = {Integer.valueOf(5),Integer.valueOf(3),Integer.valueOf(1)};
		BS bs = new BS();
		List<Integer> sorted = bs.sort(Arrays.asList(a));
		System.out.println(sorted);
	}
	
}

