public class FibonacciSequence {
    private static long fibonacciCache[];
    private static long fibonacciCache2[];
    public static void main(String[] args) {
        int n = 50;
        fibonacciCache = new long[n + 1];
        System.out.println(fibonacciSequence(n));
    }

    public static long fibonacciSequence(int count) {
        if (count == 0) {
            fibonacciCache[0] = 0;
            return 0;
        }

        if (count == 1) {
            fibonacciCache[0] = 0;
            fibonacciCache[1] = 1;
            return 1;
        };
        
        long number1 = 0;
        long number2 = 1;
        long nthNumber = 0;

        fibonacciCache[0] = 0;
        fibonacciCache[1] = 1;

        // O(n) Time Complexity O(n) Space Complexity 
        for (int i = 2; i <= count; i++) {
            nthNumber = number1 + number2;
            fibonacciCache[i] = nthNumber;
            number1 = number2;
            number2 = nthNumber;
        }
        return nthNumber;
    }

    // O(n) Time Complexity O(n) Space Complexity 
    public static long fibonacciSequence2(int n) {
        if (n <= 1) return n;

        if (fibonacciCache2[n] != 0) return fibonacciCache2[n];

        long nthFibonacciNumber = (fibonacciSequence2(n - 1) + fibonacciSequence2(n - 2));
        fibonacciCache2[n] = nthFibonacciNumber;
        return nthFibonacciNumber;
        
    }
}
