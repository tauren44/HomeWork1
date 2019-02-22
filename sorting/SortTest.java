package practice.sorting;

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

        int[] speedTest = new int[1_000_000];
        for(int i = 999999; i >= 0; i--) {
            speedTest[i] = i;
        }

        long before = System.currentTimeMillis();

        //SelectionSort.sort(speedTest);
        //InsertionSort.sort(speedTest);
        //HeapSort.sort(speedTest);
        //ShellSort.sort(speedTest);
        BucketSort.sort(speedTest);

        long after = System.currentTimeMillis();
        System.out.println(after - before + " ms.");

    }



}
