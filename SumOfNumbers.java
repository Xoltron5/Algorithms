import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        System.out.println("Enter a number to add all the numbers including that one up.");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Number: " + addUp(number));
        scanner.close();
    }   
    
    // O(1) Time Complexity O(1) Space Complexity
    public static int addUp(int number) {
        return number * (number + 1) / 2;
    }

    // O(n) Time Complexity O(1) Space Complexity
    public static int addUp2(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }
}
