public class InsertionSort {
    public static void main(String[] args) {
        int array[] = {9, 6, 5, 2, 1, 4, 3, 7, 8};

        System.out.println("Unsorted Array");
        for (int element : array) {
            System.err.print(element + " ");
        }
        
        insertionSort(array);

        System.out.println();

        System.out.println("Sorted Array");
        for (int element : array) {
            System.err.print(element + " ");
        }
    }
    // O(n^2) Time Complexity O(1) Space Complexity
    public static void insertionSort(int array[]) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i]; // current element
            int j = i - 1; // previous element
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j]; // swaps the element at current index with the one previous index. 
                j--; // allows us to compare the new element swapped to the next previous one. 
            }
            array[j + 1] = temp; // place the element at it's new position.
        }
    }
}
