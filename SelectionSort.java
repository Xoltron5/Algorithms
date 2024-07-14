public class SelectionSort {
    public static void main(String[] args) {
        int array[] = {9, 6, 5, 2, 1, 4, 3, 7, 8};

        System.out.println("Unsorted Array");
        for (int element : array) {
            System.err.print(element + " ");
        }
        
        selectionSort(array);

        System.out.println();

        System.out.println("Sorted Array");
        for (int element : array) {
            System.err.print(element + " ");
        }
    }
    // O(n^2) Time Complexity O(1) Space Complexity
    public static void selectionSort(int array[]) {
        for (int i = 0; i < (array.length - 1); i++) {
            int min = i;
            boolean minChanged = false;

            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                    minChanged = true; 
                }
            }
            if (minChanged) {
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
    }
}
