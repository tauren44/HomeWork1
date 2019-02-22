package practice.sorting;

import java.util.Arrays;

public class BucketSort {
    public static void sort(int[] numbers) {
        int i, j;
        int[] bucket = new int[numbers.length+1];
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
}
