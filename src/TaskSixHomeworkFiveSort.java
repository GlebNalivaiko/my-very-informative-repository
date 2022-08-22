import java.util.Arrays;
import java.util.Random;
public class TaskSixHomeworkFiveSort {
    public static void main(String[] args ){
        Random r=new Random();
        int[][] arr=new int[2][5];
        System.out.println("Array before the sort procedure:");
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr[i].length;j++){
                int k= r.nextInt(10,51);
                arr[i][j]=k;
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
        Arrays.sort(arr[0]);
        Arrays.sort(arr[1]);
        System.out.println("Array after the sort procedure:");
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr[i].length;j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
