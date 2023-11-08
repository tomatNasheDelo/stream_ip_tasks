package obedinit_dva_massiva;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {3,5,7,8,9};
		int[] b = {67, 89, 32, 4 ,2};
		
		   System.out.println(Arrays.toString(join(a,b)));

	}
	
	public static int[] join(int[] a, int[] b) {
		
	    return IntStream.concat(Arrays.stream(a), Arrays.stream(b))
	                    .toArray();
	}

}
