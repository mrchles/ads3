For this assignment I select three algorithms: Bubble Sort, Quick Sort, and Binary Search. The goal of the project was to understand how these algorithms work and compare their performance in practice.
I tested the algorithms on arrays of different sizes: 10, 100, and 1000 elements. For each size, I used both random arrays and already sorted arrays. To measure execution time, I used System.nanoTime().

Description:

1) Bubble Sort is a simple sorting algorithm that compares neighboring elements and swaps them if they are in the wrong order. After each pass, the largest element moves to the end of the array.
Its time complexity is O(n²), so it becomes slow for large datasets.

3) Quick Sort is a more efficient algorithm that uses a divide-and-conquer approach. It selects a pivot element (in my implementation, the last element) and splits the array into smaller and larger parts. Then it recursively sorts these parts.
 Its average time complexity is O(n log n), but in the worst case it can be O(n²).

5) Binary Search is a searching algorithm that works only on sorted arrays. It checks the middle element and reduces the search space by half each step.
   Its time complexity is O(log n), which makes it very fast.

Experiment results:

The results of the experiments are shown below:

| Array Size | Input Type | Bubble Sort (ns) | Quick Sort (ns) | Binary Search (ns) |
| ---------- | ---------- | ---------------- | --------------- | ------------------ |
| 10         | Random     | 8000             | 2400            | 1700               |
| 10         | Sorted     | 1700             | 2800            | 500                |
| 100        | Random     | 169200           | 24200           | 1000               |
| 100        | Sorted     | 99400            | 168200          | 300                |
| 1000       | Random     | 5273300          | 101700          | 2400               |
| 1000       | Sorted     | 1598500          | 966600          | 500                |


Which sorting algorithm performed faster? Why?
Quick Sort was faster in most cases, especially on random arrays with 100 and 1000 elements. This is because Quick Sort has an average time complexity of O(n log n), while Bubble Sort has O(n²), which is much slower for large inputs.

For very small arrays, the difference is not always clear because the execution time is very small and may vary between runs.

How does performance change with input size?
As the size of the array increases, the execution time also increases. This effect is much more noticeable for Bubble Sort. For example, sorting 1000 elements takes significantly more time than sorting 10 or 100 elements.

Quick Sort also becomes slower with larger arrays, but the increase in time is not as dramatic as with Bubble Sort.

How does sorted vs unsorted data affect performance?
Sorted and unsorted arrays affect the algorithms differently. Bubble Sort usually works faster on sorted arrays because it performs fewer swaps.

Quick Sort can become slower on sorted arrays in this implementation because the last element is used as the pivot. If the array is already sorted, this can lead to unbalanced partitions and reduce efficiency.

Do the results match the expected Big-O complexity?
Yes, the results mostly match the expected Big-O complexity. Bubble Sort becomes much slower as the input size increases, which is consistent with O(n²). Quick Sort performs better on average, which matches its O(n log n) complexity.

Which searching algorithm is more efficient? Why?
In this project, Binary Search is more efficient. It has a time complexity of O(log n), which makes it very fast, especially for large arrays.

Compared to Linear Search, Binary Search is faster because it does not check every element. Instead, it reduces the search space by half at each step.

Why does Binary Search require a sorted array?
Binary Search requires a sorted array because it relies on the order of elements. It checks the middle value and decides whether to search in the left or right half. If the array is not sorted, this decision cannot be made correctly.
