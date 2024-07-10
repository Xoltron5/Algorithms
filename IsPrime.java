import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        System.out.println("Enter a number to check if it's prime: ");
        Scanner scanner = new Scanner(System.in);

        if (isPrime(scanner.nextInt())) {
            System.out.println("Prime");
        }
        else {
            System.out.println("Not Prime");
        }
        scanner.close();
    }
    // O(sqr(n)) Time Complexity O(1) Space Complexity
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false; // numbers below 2 are not prime
        }

        if (number == 2) {
            return true; // 2 is the only even prime number
        }
        
        if (number % 2 == 0) {
            return false; // All other even numbers are not prime
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if ((number % i) == 0) {
                return false;
            }
        }
        return true; 
    }
}
