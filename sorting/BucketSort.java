package practice.sorting;

import java.util.Arrays;

public class BucketSort {
    public static void sort(int[] numbers) {
        int i, j;
        int[] bucket = new int[maxValue(numbers) + 1]; //+1 is because if the array have max item = 10, we need buckets from 0 to 10 (so equals 11)
        Arrays.fill(bucket, 0);
        for (i = 0; i < numbers.length; i++) {
            bucket[numbers[i]]++;
        }
        int k=0;
        for (i = 0; i < bucket.length; i++) {
            for (j = 0; j < bucket[i]; j++) {
                numbers[k++] = i;
            }
        }
    }

     private static int maxValue(int [] array) {
        int maxValue = 0;
         for (int item : array) {
             if (item > maxValue) {
                 maxValue = item;
             }
         }
        return maxValue;
    }
}
