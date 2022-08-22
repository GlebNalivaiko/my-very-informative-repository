import java.util.Scanner;
public class TaskZeroHomeworkFourArrayGuess {
    public static void main(String[] args) {
        int[] arr = {3, 7, 8, 11, 17};
        System.out.print("The array called 'arr' has "+arr.length +" elements!\nTry to guess all elements of massive!\nProgramme will be working at the time when you guess all elements of array:");
        Scanner sc = new Scanner(System.in);
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
                    System.out.println("This number is a part of array!\nKeep it right! ");
                    break;
                }
            }
        }
    }
}
