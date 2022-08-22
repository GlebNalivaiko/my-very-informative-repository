package SomeChanges;

import java.util.Arrays;
import java.util.Random;

public class ArraySort {
    public static void main(String[] args) {
        Random r = new Random();
        int[][] arr = new int[3][5];
        System.out.println("Array before the sort procedure:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int k = r.nextInt(10, 51);
                arr[i][j] = k;
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(arr));
        for (int[] ints : arr) {
            Arrays.sort(ints);
        }
        System.out.println("Array after the sort procedure:");
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + "  ");
            }
            System.out.println();
        }
    }
}
