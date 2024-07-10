public class FibonacciSequence {
    public static void main(String[] args) {
        fibonacciSequence(10);
    }

    public static void fibonacciSequence(int count) {
        int number1 = 0;
        int number2 = 1;

        System.out.println(number1);
        System.out.println(number2);

        // O(n) Time Complexity O(1) Space Complexity 
        for (int i = 0; i < count; i++) {
            int number3 = number1 + number2;
            System.out.println(number3);
            number1 = number2;
            number2 = number3;
        }
    }
}
