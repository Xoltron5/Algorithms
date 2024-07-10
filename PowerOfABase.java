import java.util.Scanner;

public class PowerOfABase {

    public static void main(String[] args) {
        int base; 
        int power;
        int result = 1;
        Scanner scanner = new Scanner(System.in);

        // 2^2 = 2 * 2 = 4

        try {
            System.out.print("Enter a base: ");
            base = scanner.nextInt();
            
            System.out.print("Enter a power: ");
            power = scanner.nextInt();

            result = pow2(base, power);
            System.out.println("Result: " + result);
        } 
        catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter integers.");
        }
        finally {
            scanner.close();
        }
    }

    // O(Log n) Time Complexity O(1) Space Complexity
    public static int pow2(int base, int power) {

        if (power == 0) {
            return 1;
        }

        if (base == 0) {
            return 0;
        }

        int result = 1;

        while (power > 0) {
            if ((power % 2) == 1) {
                result *= base; 
            }
            base *= base; 
            power /= 2;
        }

        return result;
    }

    // O(n) Time Complexity O(1) Space Complexity
    public static int pow(int base, int power) {

        if (power == 0) {
            return 1;
        }

        if (base == 0) {
            return 0;
        }

        int result = 1;

        for (int i = 0; i < power; i++) {
            result = result * base;
        }

        return result;
    }
}