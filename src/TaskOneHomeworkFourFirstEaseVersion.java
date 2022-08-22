import java.util.Arrays;
import java.util.Scanner;
public class TaskOneHomeworkFourFirstEaseVersion {
    public static void main(String[] args){
        int[] arr={1,2,3,3,4,5,6,7};
        System.out.print("Enter the number:");
        int j=new Scanner(System.in).nextInt();
        for(int i=0;i< arr.length;i++){
            if(arr[i]==j){
                arr[i]=0;
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}
