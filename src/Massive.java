import java.util.Arrays;

public class Massive {
    public  static void main(String[] args) {
        int[] arr = new int[10];
        arr[1] = 3;
        arr[2] = 1;
        arr[0] = 2;
        System.out.println(arr[1]);
        System.out.println("arr.length:" + arr.length);
        System.out.println("args.length" + args.length);
        Arrays.sort(arr);
        int[] arr2 =new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i;
            arr2[i]=arr[arr.length-1-i];

           //  arr[i]=i*2;
          //  System.out.println("arr[" +i+"]="+arr[i]);
            //System.out.println("arr2["+(2-i)+"]="+arr2[arr.length-1-i]);
            }
        System.arraycopy(arr,1,arr2,2,3);
        System.out.println("after coping");
        for(int i =0; i<arr2.length;i++){
            System.out.println("arr2["+(i)+"]=" + arr2[i]);
        }
        for(int element: arr2){
            System.out.println(element);
        }
        }
    }

