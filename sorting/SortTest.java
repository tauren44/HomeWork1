package practice.sorting;

import java.util.Random;

public class SortTest {
    public static void main(String[] args) {

        int[] numbers = {3, 6, 1, 7, 2, 8, 10, 4, 9, 5};
        SelectionSort.sort(numbers);
        SortUtil.print(numbers);

        int[] numbers2 = {3, 6, 1, 7, 2, 8, 10, 4, 9, 5};
        InsertionSort.sort(numbers2);
        SortUtil.print(numbers2);

        int[] numbers3 = {3, 6, 1, 7, 2, 8, 10, 4, 9, 5};
        HeapSort.sort(numbers3);
        SortUtil.print(numbers3);

        int[] numbers4 = {3, 6, 1, 7, 2, 8, 10, 4, 9, 5};
        ShellSort.sort(numbers4);
        SortUtil.print(numbers4);

        int[] numbers5 = {3, 6, 1, 7, 2, 8, 10, 4, 9, 5};
        BucketSort.sort(numbers5);
        SortUtil.print(numbers5);

        long before = System.currentTimeMillis();
        BucketSort.sort(SortUtil.getRandomInts());
        long after = System.currentTimeMillis();
        System.out.println("BucketSort: " + (after - before) + " ms.");

        before = System.currentTimeMillis();
        SelectionSort.sort(SortUtil.getRandomInts());
        after = System.currentTimeMillis();
        System.out.println("SelectionSort: " + (after - before) + " ms.");

        before = System.currentTimeMillis();
        InsertionSort.sort(SortUtil.getRandomInts());
        after = System.currentTimeMillis();
        System.out.println("InsertionSort: " + (after - before) + " ms.");

        before = System.currentTimeMillis();
        HeapSort.sort(SortUtil.getRandomInts());
        after = System.currentTimeMillis();
        System.out.println("HeapSort: " + (after - before) + " ms.");

        before = System.currentTimeMillis();
        ShellSort.sort(SortUtil.getRandomInts());
        after = System.currentTimeMillis();
        System.out.println("ShellSort: " + (after - before) + " ms.");
    }
}
