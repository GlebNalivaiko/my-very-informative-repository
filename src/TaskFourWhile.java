import java.util.Random;
import java.util.Scanner;

public class TaskFourWhile {
    public static void main(String[] args) {
        System.out.print("Enter the size of the array:");
        Scanner sc=new Scanner(System.in);
        int numberOfArrays=sc.nextInt();
        while (numberOfArrays < 5 || (numberOfArrays > 10)){
            System.out.print("Repeat the input!\nEnter the size of the array:");
        numberOfArrays= sc.nextInt();
        if(numberOfArrays>=5&&numberOfArrays <= 10){
        System.out.println("Cool!");
        break;
         }
        }
        int[] arr=new int[numberOfArrays];
        for(int in=0;in<arr.length;in++){
            int arrayElements=new Random().nextInt(0,1001);
            arr[in]=arrayElements;
            System.out.print("arr["+in+"]="+arr[in]+"; ");

            }
        }
}





