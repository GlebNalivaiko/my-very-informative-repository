package SomeChanges;

import java.util.Random;

public class Multiplication {
    public static void main(String[] args){
        int[][] arr=new int[3][3];
        Random ran =new Random();
        System.out.println("First array:");
        for(int i=0;i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
                int z= ran.nextInt(1,10);
                arr[j][i]=z;
                System.out.print(arr[j][i]+"  ");
            }
            System.out.println();
        }
        int[][] arr2=new int[3][3];
        System.out.println("Second array:");
        for(int k=0;k<arr2.length;k++) {
            for (int g = 0; g < arr2[k].length; g++) {
                int w = ran.nextInt(1, 10);
                arr2[g][k] = w;
                System.out.print(arr2[g][k] + "  ");
            }
            System.out.println();
        }
        System.out.println("Third array:");//3 the array is the product of the previous two
        int[][] arr3=new int[3][3];
        for (int s=0;s<arr3.length;s++){
            for(int e=0;e< arr3[s].length;e++){
                arr3[s][e]=arr[s][e]*arr2[s][e];
                System.out.print(arr3[s][e]+"  ");
            }
            System.out.println();
        }

    }
}
