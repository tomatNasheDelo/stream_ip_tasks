package average;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {3,6,7,8,87,98,23};
		
		System.out.println(findAverageUsingStream(a)); 
		System.out.println(findAverageUsingStream2(a)); 

	}
	
	
	public static double findAverageUsingStream(int[] array) {
	    return Arrays.stream(array).average().orElse(Double.NaN);
	}
	
	public static double findAverageUsingStream2(int[] array) {
	    return Arrays.stream(array).average().orElse(Double.NaN);
	}
	
	

}
