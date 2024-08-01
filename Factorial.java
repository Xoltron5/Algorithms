import java.util.Scanner;

public class Factorial {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number; 
        
        System.out.println("Enter a number to get a factorial of: ");
        number = scanner.nextInt();
        scanner.close();
        System.out.println("Factorial: " + factorial(number));
    }

    // O(n) Time Complexity O(1) Space Complexity 
    public static long factorial(int number) {
        long result = 1;

        for (int i = number; i > 1; i--) {
            result *= i;
        }
        return result;
    }

    // O(n) Time Complexity O(n) Space Complexity 
    public static long factorial2(int number) {

        if (number < 1) return 1;

        return factorial(number - 1);
    }
}
