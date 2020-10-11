package cd.get.ready.algorithms;

public class Fibonacci {
    public int getFibonacciValue(int n){

        int[] intArray = new int[n + 1];

         for (int i = 0; i < n + 1; i++) {
             if (i <= 1) {
                 intArray[n] = i;
             } else {
                 intArray[0] = 0;
                 intArray[1] = 1;
                 intArray[i] = intArray[i - 1] + intArray[i - 2];
                 intArray[n] = intArray[i];
             }
         }

        return intArray[n];
    }
}
