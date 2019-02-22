package practice.sorting;

public interface SortUtil {

     static void swap(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

    static void print(int[] numbers){
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }


}
