import java.util.Scanner;
public class Work {
    public  static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number of array:");
        int numberOfMassive=sc.nextInt();
        int[] arr=new int[numberOfMassive];
        for(int in =0;in<numberOfMassive;in++){
            System.out.print("arr["+in+"]=");
            arr[in]=sc.nextInt();
        }
    }
}
