package SomeChanges;


import java.util.Arrays;

public class ArrayForEach {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int items : arr) {
            boolean b = items == 2;
            System.out.println(b);
        }
        System.out.println(Arrays.toString(arr));
    }
}
