import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class TaskZeroRandomFourChanges {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Random r = new Random();
        System.out.print("The array called 'arr' has " + arr.length + " elements!\nDiapason of this elements from 1 to 15 inclusive!\nTry to guess all elements of array!\nPlease don't repeat later elements, if you want to play clearly!\nYou have 5 attempts:");
        Scanner sc = new Scanner(System.in);
        for (int x = 0; x < arr.length; x++) {
            int y = r.nextInt(1, 16);
            arr[x] = y;
            for(int u=0;u<x;u++)// Этот цикл поможет уменьшить количество повторяемых элементов!
                if(y==arr[u]&&u!=0){
                    arr[u]=r.nextInt(1,16);
                }
        }  int h=0;//количество отгаданных элементов!
        for (int j = 0; j <5; j++) {
            int i = sc.nextInt();
            for (int k = 0; k < arr.length; k++) {
                if (i != arr[k] && k == 4) {
                    switch (j) {
                        case 0 -> System.out.print("This number is not a part of array!\nYou have 4 attempts!\nTry again:");
                        case 1 -> System.out.print("This number is not a part of array!\nYou have 3 attempts!\nTry again:");
                        case 2 -> System.out.print("This number is not a part of array!\nYou have 2 attempts!\nTry again:");
                        case 3 -> System.out.print("This number is not a part of array!\nYou have 1 attempt! \nTry again:");
                        case 4 -> System.out.print("This number is not a part of array!");
                    }
                }
                if (i == arr[k]) {
                    switch (j) {
                        case 0 -> System.out.print("This number is a part of array!\nKeep it right!\nYou have 4 attempts!\nTry again:");
                        case 1 -> System.out.print("This number is a part of array!\nKeep it right!\nYou have 3 attempts!\nTry again:");
                        case 2 -> System.out.print("This number is a part of array!\nKeep it right!\nYou have 2 attempts!\nTry again:");
                        case 3 -> System.out.print("This number is a part of array!\nKeep it right!\nYou have 1 attempt! \nTry again:");
                        case 4 -> System.out.println("This number is a part of array!");
                    }
                    h++;
                    break;
                }
            }
        }
        if(h<3) {
            System.out.print("Good game!\nYou guess " + h + " elements of array!\nIt is not very big,try again and guess more elements!\nBut now you see the correct answers:");
        }else{
            System.out.print("Great game!\nYou guess " + h + " elements of array!\nIt is very large!\nBut now you see the correct answers:");
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
