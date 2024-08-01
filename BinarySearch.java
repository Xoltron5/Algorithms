import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        
        int array[] = {1, 2, 3, 4, 5};
        
        int value = 5;
        
        System.out.println(binarySearch(array, value));
        System.out.println(Arrays.binarySearch(array, value));

        System.out.println();
    }

    public static int binarySearch(int numbers[], int numberToFind) {
        int low = 0;
        int high = numbers.length - 1;

        while (low <= high) {
            int middlePosition = (low + high) / 2;
            int middleNumber = numbers[middlePosition];

            // Number Found!
            if (numberToFind == middleNumber) {
                return middlePosition;
            }

            if (numberToFind < middleNumber) {
                high = middlePosition - 1;
            } else {
                low = middlePosition + 1;
            }
        }   


        // Number not found! 
        return -1;
    }
}