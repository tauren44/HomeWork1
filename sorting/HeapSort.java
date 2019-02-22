package practice.sorting;

public class HeapSort {
    public static void sort(int[] numbers) {
        for (int i = numbers.length / 2 - 1; i >= 0; i--) {
            shiftDown(numbers, i, numbers.length);
        }
        for (int i = numbers.length - 1; i > 0; i--) {
            SortUtil.swap(numbers, 0, i);
            shiftDown(numbers, 0, i);
        }
    }

    private static void shiftDown(int[] numbers, int i, int j) {
        int child;
        int temp;

        for (temp = numbers[i]; leftChild(i) < j; i = child) {
            child = leftChild(i);
            if (child != j - 1 && (numbers[child] < numbers[child + 1])) {
                child++;
            }
            if (temp < numbers[child]) {
                numbers[i] = numbers[child];
            } else {
                break;
            }
        }
        numbers[i] = temp;
    }

    private static int leftChild(int i) {
        return 2 * i + 1;
    }

}
