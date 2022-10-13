import java.util.Arrays;
public class Algo {
	public static boolean Algo1(int[] arr ) {
		int current =0;
		for(int i=0; i< arr.length; i++) {
			current = arr[i];
			for(int j=0; j< arr.length; j++) {
				if(current == -1*arr[j]) {
					return true;
				}
			}
		}
		return false;
	}
	public static void Algo2(int[] arr ) {
		
		for(int i =0; i< arr.length; i++) {
			binary(-arr[i], arr);
		}
		
	}
	public static boolean binary(int x, int[] arr) {
			int first = 0;
			int last = arr.length-1;
			while(first <= last) {
				int middle  = (int)((first+ last)/2);
				if(arr[middle] == x) {
					return true;
				}
				else if(x< arr[middle]) {
					last = middle -1;
				}
				else {
					first = middle +1;
				}
			}
			return false;
	}
	public static boolean Algo3(int[] arr) {
		
	
		int i = 0;
		int j =arr.length-1;
	
		
		while(i != j) {
			int sum = arr[i] + arr[j];
			if(sum ==0) {
				return true;
			}
			else if(sum < 0) {
				i++;
			}
			else if(sum > 0) {
				j--;
			}	
		}
		return false;
	}
}
