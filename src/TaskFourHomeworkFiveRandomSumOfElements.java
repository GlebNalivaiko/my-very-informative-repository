import java.util.Random;
public class TaskFourHomeworkFiveRandomSumOfElements {
    public static void main(String[] args) {
        Random r = new Random();
        int[][] arr = new int[2][3];
        int sum=0;
        System.out.println("Array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int k = r.nextInt(1, 51);
                arr[i][j]=k;
                sum+=arr[i][j];
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
            //   int[][] arr={{12,23,12},
            //              {32,12,34}};
            // int sum=0;
            //for(int i=0;i< arr.length;i++){
            //  for(int j=0;j<arr[i].length;j++){
            // sum+=arr[i][j];
            //  }
        }
        // System.out.println(sum);
        // }
        System.out.println("Sum of array elements:"+sum);
    }
}
