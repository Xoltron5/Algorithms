public class MergeSort {
    public static void main(String[] args) {
        int array[] = {9, 6, 5, 2, 1, 4, 3, 7, 8};

        System.out.println("Unsorted Array");
        for (int element : array) {
            System.err.print(element + " ");
        }
        
        mergeSort(array);

        System.out.println();

        System.out.println("Sorted Array");
        for (int element : array) {
            System.err.print(element + " ");
        }
    }
    // O(n log(n) Time Complexity O(n) Space Complexity
    public static void mergeSort(int array[]) {
        int arraylength = array.length;

        if (arraylength < 2) return; 

        int midIndex = arraylength / 2;
        int leftHalf[] = new int[midIndex];
        int rightHalf[] = new int[arraylength - midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = array[i];
        }

        for (int i = midIndex; i < arraylength; i++){
            rightHalf[i - midIndex] = array[i]; 
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);
        merge(array, leftHalf, rightHalf);
    }

    public static void merge(int array[], int leftHalf[], int rightHalf[]) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;
        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                array[k] = leftHalf[i];
                i++;
            } 
            else {
                array[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            array[k] = leftHalf[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            array[k] = rightHalf[j];
            j++;
            k++;
        }
    }
}
