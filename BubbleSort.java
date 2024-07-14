public class BubbleSort {
    public static void main(String[] args) {
        int array[] = {9, 6, 5, 2, 1, 4, 3, 7, 8};

        System.out.println("Unsorted Array");
        for (int element : array) {
            System.err.print(element + " ");
        }
        
        bubbleSort(array);

        System.out.println();

        System.out.println("Sorted Array");
        for (int element : array) {
            System.err.print(element + " ");
        }
    }
    // O(n^2) Time Complexity O(1) Space Complexity
    public static void bubbleSort(int array[]) {
        boolean isSwapped = false;

        for (int i = 0; i < (array.length - 1); i++) {
            for (int j = 0; j < (array.length - i - 1); j++){
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    isSwapped = true;
                } 
            }
            // if we have not swapped it means the array is already sorted.
            if (!isSwapped) {
                break;
            }
        }
    }
}
