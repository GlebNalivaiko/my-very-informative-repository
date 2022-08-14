import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class TaskFourHomeworkFourEvenElements {
    public static void main(String[] args){
        int[] arr=new int[10];
        Random r=new Random();
        System.out.println("First array:");
        for(int i=0;i<arr.length;i++){
            int j=r.nextInt(1,51);
            arr[i]=j;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.print("Please enter the size of array called 'arr2', diapason from 5 to 10 inclusive:");
        Scanner sc= new Scanner(System.in);
        int k=sc.nextInt();
        for(int e=1;e<3;++e) {
            if (k >= 5 && k <= 10) {
                System.out.print("Good!\nSecond array consist with even elements:");
                e=2;
            }else {
                System.out.print("Please,try again!\nDiapason from 5 to 10 inclusive:");
                k= sc.nextInt();
                e = 1;
            }
        }
        int q=0;
        int[] arr2=new int[k];
        for(int a:arr){
            if(a%2==0){
                arr2[q]=a;
                q++;
            }
        }
        System.out.print(Arrays.toString(arr2));
    }
}
