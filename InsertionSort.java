public class InsertionSort {

	public int[] sort(int[] input) {
		if(input == null)
			return input;
		if(input.length == 1)
			return input;
		for(int i=0; i<input.length-1 ; i++) {
			int j=i+1;
			while(j > 0 && input[j] < input[j-1]) {
				int temp = input[j];
				input[j] = input[j-1];
				input[j-1] = temp;
				j = j -1;
			}			
		}
		return input;
	}
	
	public static void main(String args[]) 
    { 
        int arr[] = { 12, 11, 13, 5, 6 }; 
  
        InsertionSort ob = new InsertionSort(); 
        ob.sort(arr); 
  
        printArray(arr); 
    }
	
	static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
  
        System.out.println(); 
    }
}
