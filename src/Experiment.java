public class Experiment {

    Sorter sorter = new Sorter();
    Searcher searcher = new Searcher();

    public long measureSortTime(int[] arr, String type) {

        long start = System.nanoTime();

        if (type.equals("bubble")) {
            sorter.BubbleSort(arr);
        } else if (type.equals("quick")) {
            sorter.quickSort(arr);
        }

        long end = System.nanoTime();
        return end - start;
    }

    public long measureSearchTime(int[] arr, int target) {

        long start = System.nanoTime();

        searcher.BinarySearch(arr, target);

        long end = System.nanoTime();
        return end - start;
    }

    public void runAllExperiments() {

        int[] sizes = {10, 100, 1000};

        for (int size : sizes) {

            int[] randomArr = sorter.generateRandomArray(size);
            int[] sortedArr = randomArr.clone();
            sorter.quickSort(sortedArr);



            int[] r1 = randomArr.clone();
            int[] r2 = randomArr.clone();

            long bubbleRandom = measureSortTime(r1, "bubble");
            long quickRandom = measureSortTime(r2, "quick");

            int[] s1 = sortedArr.clone();
            int[] s2 = sortedArr.clone();

            long bubbleSorted = measureSortTime(s1, "bubble");
            long quickSorted = measureSortTime(s2, "quick");

            sorter.quickSort(randomArr);
            long searchRandom = measureSearchTime(randomArr, randomArr[size / 2]);
            long searchSorted = measureSearchTime(sortedArr, sortedArr[size / 2]);



            System.out.println("size: " + size);

            System.out.println("random array:");
            System.out.println("bubble Sort: " + bubbleRandom + " ns");
            System.out.println("quick Sort: " + quickRandom + " ns");
            System.out.println("binary Search: " + searchRandom + " ns");

            System.out.println();

            System.out.println("sorted array:");
            System.out.println("bubble Sort: " + bubbleSorted + " ns");
            System.out.println("quick Sort: " + quickSorted + " ns");
            System.out.println("binary Search: " + searchSorted + " ns");
        }
    }
}