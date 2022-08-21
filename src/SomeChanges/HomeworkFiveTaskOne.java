package SomeChanges;

import java.util.Scanner;

public class HomeworkFiveTaskOne {
    public static void main(String[] args) {
        int[][][] arr = new int[3][3][3];
        Scanner sc = new Scanner(System.in);
        int z = 0;
        for (int j = 0; j < arr.length; j++) {
            for (int k = 0; k < arr[j].length; k++) {
                for (int l = 0; l < arr[k].length; l++) {
                    z++;
                    arr[j][k][l] = z;
                    System.out.print(arr[j][k][l] + "  ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Now you can write some numbers, which will pluses with old elements of array:");
        int x = sc.nextInt();
        for (int j = 0; j < arr.length; j++) {
            for (int k = 0; k < arr[j].length; k++) {
                for (int l = 0; l < arr[k].length; l++) {
                    arr[j][k][l] += x;
                }
            }
        }
        System.out.println("New array with some changes:");
        for (int[][] ints : arr) {
            for (int w = 0; w < ints.length; w++) {
                for (int q = 0; q < arr[w].length; q++) {
                    System.out.print(ints[w][q] + "  ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}


