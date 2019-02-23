package practice.sorting;

public class SelectionSort {

    public static void sort(int[] numbers) {
        for (int temp = 0; temp <= numbers.length-1; temp++) {
            SortUtil.swap(numbers, temp, getSmallest(numbers, temp, numbers.length-1));
        }
    }

    public static int getSmallest(int[] numbers, int min, int max) {
        int small = min;
        for (int i = min + 1; i <= max; i++) {
            if (numbers[i] < numbers[small]) {
                small = i;
            }
        }
        return small;
    }
}
