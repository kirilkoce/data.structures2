package DataStructures2;

public class sumAll {
	
public static void sumAllValues(int[] value) {
		
		int sum = 0;
		for(int i=0; i< value.length; i++) {
			sum += value[i];
		}
		
		System.out.println(sum);
	}
	
	public static void main(String[] args ) {
		int []numbers = {1,9,2,8,7,3}; 
		
		sumAllValues(numbers);
	}
	
	
}
