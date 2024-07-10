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

    public static long factorial(int number) {
        long result = 1;

        for (int i = number; i > 1; i--) {
            result *= i;
        }

        return result;
    }
}
