package SomeChanges;

import java.util.Random;

public class DiagonalOfArray {
    public static void main(String[] args) {
        Random r = new Random();
        int[][] arr = new int[6][6];
        System.out.println("Array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int k = r.nextInt(10, 51);
                arr[i][j] = k;
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.print("First diagonal of elements:");
        for (int z = 0; z < arr.length; z++) {

            System.out.print(arr[z][z] + "  ");

        }
        System.out.println();
        System.out.print("Second diagonal of elements:");
        for (int u = 0; u < arr.length; u++) {
            for (int g = 0; g < arr[u].length; g++) {
                if (g + u == 5) {
                    System.out.print(arr[g][u] + "  ");
                }

            }
        }
    }
}
