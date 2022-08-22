import java.util.Random;
import java.util.Scanner;
public class TaskZeroHomeworkFourRandom {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Random r=new Random();
        System.out.print("The array called 'arr' has "+arr.length +" elements!\nTry to guess all elements of array!\nThe program will run until you guess all the elements:");
        Scanner sc = new Scanner(System.in);
        for(int x=0;x< arr.length;x++){
            int y= r.nextInt(1,21);
            arr[x]=y;
        }
        for (int j = 0; j < arr.length; j++) {
            int i = sc.nextInt();
            for (int k = 0; k < arr.length; k++) {
                if (i != arr[k] && k == 4) {
                    switch (j){
                        case 0->System.out.print("This number is not a part of array!\nYou guess zero elements!\nTry again:");
                        case 1->System.out.print("This number is not a part of array!\nYou guess only one element!\nTry again:");
                        case 2->System.out.print("This number is not a part of array!\nYou guess only two elements!\nTry again:");
                        case 3->System.out.print("This number is not a part of array!\nYou guess three elements!\nTry again:");
                        case 4->System.out.print("This number is not a part of array!\nYou guess four elements!\nTry to guess last one:");
                    }
                    j--;
                }
                if (i == arr[k]) {
                    switch (j) {
                        case 0, 1, 2, 3 -> System.out.print("This number is a part of array!\nKeep it right!\nTry again:");
                        case 4 -> System.out.println("This number is a part of array!\nKeep it right!");
                    }
                    break;
                }
            }
        }
        System.out.println("Good game, Bro!");
    }
}
