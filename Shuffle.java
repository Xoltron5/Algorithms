import java.util.Random;

public class Shuffle {

    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5};

        System.out.println("Unshuffled Array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();

        shuffle(numbers);

        System.out.println("Shuffled Array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    // Fisher-Yates Shuffle Algorithm 
    // O(n) Time Complexity O(1) Space Complexity
    public static void shuffle(int numbers[]) {
        Random random = new Random();
        int randomIndex;
        int temp;

        for (int i = numbers.length - 1; i > 0; i--) {
            randomIndex = random.nextInt(i + 1);
            temp = numbers[i];
            numbers[i] = numbers[randomIndex];
            numbers[randomIndex] = temp;
        }
    }
}
