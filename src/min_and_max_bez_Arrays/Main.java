package min_and_max_bez_Arrays;

import java.util.stream.IntStream;

class Main
{
    public static void main(String[] args)
    {
        int[] A = { 6, 8, 3, 5, 1, 9 };
 
        int max = IntStream.range(0, A.length)
                        .map(i -> A[i])
                        .max()
                        .getAsInt();
 
        int min = IntStream.range(0, A.length)
                        .map(i -> A[i])
                        .min()
                        .getAsInt();
 
        System.out.println("Min element is " + min);
        System.out.println("Max element is " + max);
    }
}