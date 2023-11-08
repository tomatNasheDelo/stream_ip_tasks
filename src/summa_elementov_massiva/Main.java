package summa_elementov_massiva;

import java.util.Arrays;

public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a = {1,5,6,7,89,};
		
		System.out.println(findSumUsingStream(a));
		

	}
	
	public static int findSumUsingStream(int[] array) {
	    return Arrays.stream(array).sum();
	}

}
