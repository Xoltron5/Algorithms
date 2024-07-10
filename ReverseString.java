import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String string;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String to Reverse: ");
        string = scanner.nextLine();

        scanner.close();

        string = reverseString(string);
        System.out.println("Reversed String: " + string);
    }
    // Time Complexity O(n) Space Complexity O(n)
    public static String reverseString(String string) {
        int lastIndex = string.length() - 1;
        char temp;
        char charArray[] = string.toCharArray();

        for (int i = 0; i < string.length() / 2; i++) {
            temp = charArray[i];
            charArray[i] = charArray[lastIndex];
            charArray[lastIndex] = temp;
            lastIndex--;
        }
        return new String(charArray);
    }
}