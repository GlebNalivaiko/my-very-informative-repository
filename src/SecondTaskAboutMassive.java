import java.util.Random;
import java.util.Scanner;
public class SecondTaskAboutMassive {
    public static void main(String[] args){
        System.out.print("Please, enter the number of arrays:");
        Scanner sc =new Scanner(System.in);
        int numberOfArrays= sc.nextInt();
        int[] arr=new int[ numberOfArrays];
        for(int i=0;i<arr.length;i++){
            int elementsOfMassive =new Random().nextInt(0,101);
            arr[i]=elementsOfMassive;
           System.out.println("arr["+i+" ]="+elementsOfMassive);
        }
        int max = arr[0];
        int min = arr[0];
        float average = 0f;
        for (int i=0;i<arr.length;i++) {
            average += arr[i];
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Maximum array element:"+max);
        System.out.println("Minimum array element:"+min);
        System.out.println("Average value of all elements:"+average/numberOfArrays);
    }
}
