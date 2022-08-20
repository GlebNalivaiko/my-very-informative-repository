package Package;

import java.util.Arrays;

public class Do {
    public static void main(String[] args) {
        int j = 5;
        float average = 0f;
        do {
            average += j;
            j++;
        } while (j < 20);
        System.out.println(average);
        System.out.println(j);
        int[] arr = new int[3];
        for (int g = 0; g < 3; g++) {
            arr[g] = g;
        }
        System.out.println(Arrays.toString(arr));
        int u = 1;
        for (int y = 1; y <= 10; y++) {
            for (int x = 1; x <= 10; x++) {
                System.out.print(u++ + "  ");
            }
            System.out.println();
        }
    }
}
