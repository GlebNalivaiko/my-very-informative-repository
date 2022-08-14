import java.util.Scanner;
public class TaskZeroHomeworkFirstVersion {
    public static void main(String[] args) {
        int[] arr = {3, 7, 8, 11, 17};
        System.out.print("The array called 'arr' has 5 elements!\nThe range of elements is from 1 to 20 inclusive!\nTry to guess elements of array:");
        Scanner sc = new Scanner(System.in);
        for (int j = 0; j < 5; j++) {
            int i = sc.nextInt();
            for (int k = 0; k < arr.length; k++) {
                if (i != arr[k] && k == 4) {
                    System.out.println("This number is not a part of array!");
                }
                if (i == arr[k]) {
                    System.out.println("This number is a part of array! ");
                    break;
                }
            }
            switch (j){
                case 0->System.out.println("Try again!\nYou have 4 attempts:");
                case 1->System.out.println("Try again!\nYou have 3 attempts:");
                case 2->System.out.println("Try again!\nYou have 2 attempts:");
                case 3->System.out.println("Try again!\nYou have 1 attempt:");
                case 4->System.out.println("Thank you for the game!");
            }
        }
    }
}
