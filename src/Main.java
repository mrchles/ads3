import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Sorter sorter = new Sorter();
        Searcher searcher = new Searcher();

        System.out.print("array size:");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("choose operation:");
        System.out.println("1 Bubble Sort");
        System.out.println("2 Quick Sort");
        System.out.println("3 Binary Search");

        int choice = scanner.nextInt();

        switch (choice) {

            case 1:
                sorter.BubbleSort(arr);
                System.out.println("sorted array (Bubble):");
                sorter.printArray(arr);
                break;

            case 2:
                sorter.quickSort(arr);
                System.out.println("sorted array (Quick):");
                sorter.printArray(arr);
                break;

            case 3:
                sorter.quickSort(arr);

                System.out.print("enter number to search:");
                int target = scanner.nextInt();

                int result = searcher.search(arr, target);

                if (result != -1) {
                    System.out.println("found at index: " + result);
                } else {
                    System.out.println("element not found");
                }
                break;

            default:
                System.out.println("error");
        }

        scanner.close();
    }
}