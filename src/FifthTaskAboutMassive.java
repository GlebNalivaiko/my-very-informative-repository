import java.util.Random;
import java.util.Scanner;
public class FifthTaskAboutMassive {
    public  static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Please, enter the number of arrays:");
        int numbersOfMassive=sc.nextInt();
        int[] arr=new int[numbersOfMassive];
        float average=0f;
        for(int i=0;i<arr.length;i++) {
            int massiveElements = new Random().nextInt(0, 101);
            arr[i] = massiveElements;
            System.out.print(arr[i]);
            if(i<arr.length-1){
                System.out.print(",");
            }
            average+=arr[i];
        }
        System.out.println("-Average of Massive elements: "+average/numbersOfMassive);
        int[] arr2=new int[numbersOfMassive];
        float average2=0f;
        for(int in=0;in<arr2.length;in++){
            int massiveEl=new Random().nextInt(0,101);
            arr2[in]=massiveEl;
            System.out.print(arr2[in]);
            if(in<arr2.length-1){
                System.out.print(",");
            }
            average2+=arr2[in];
        }
        System.out.println("-Average of Massive elements: "+average2/numbersOfMassive);
        if(average>average2){
            System.out.println("The average value of all elements of the 'arr' array is greater!");
        }
        if(average<average2){
            System.out.println("The average value of all elements of the 'arr2' array is greater! ");
        }else if (average==average2){
            System.out.println("The average value of all array elements are equal!");
        }
    }
}
