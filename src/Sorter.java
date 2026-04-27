import java.util.Random;


public class Sorter {


    public void BubbleSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public void quickSort(int[] arr) {
        quickSortRecursive(arr, 0, arr.length - 1);
    }

    private void quickSortRecursive(int[] arr, int start, int end) {
        if (start >= end) return;
        int pivotIndex = partition(arr, start, end);
        quickSortRecursive(arr, start, pivotIndex - 1);
        quickSortRecursive(arr, pivotIndex + 1, end);
    }

    private int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int smallerIndex = start;

        for (int i = start; i < end; i++) {
            if (arr[i] < pivot) {
                int temp = arr[i];
                arr[i] = arr[smallerIndex];
                arr[smallerIndex] = temp;
                smallerIndex++;
            }
        }

        int temp = arr[smallerIndex];
        arr[smallerIndex] = arr[end];
        arr[end] = temp;

        return smallerIndex;
    }

    public void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(1000);
        }
        return arr;
    }

}
