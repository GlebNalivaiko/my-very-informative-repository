public class TaskThreeHomeworkFourArray {
    public static void  main(String[] args){
        int[] arr=new int[]{2,4,34,83,6};
        float average=0f;
        for(int i=0;i<arr.length;i++){
            average+=arr[i];
            System.out.print(arr[i]);
            if(i>=0&&i<arr.length-1){
                System.out.print(",");
            }
        }
        System.out.println("-Average value of all elements: "+average/5);
        int[] arr2=new int[]{26,76,3,4,13};
        float average2=0f;
        for(int in=0;in<arr2.length;in++){
            average2+=arr2[in];
            System.out.print(arr2[in]);
            if(in>=0&&in<arr2.length-1){
                System.out.print(",");
            }
        }
        System.out.println("-Average value of all elements: "+average2/5);
        if(average/5>average2/5){
            System.out.println("The average value of all elements of the 'arr' array is greater!");
        }
        if(average/5<average2/5){
            System.out.println("The average value of all elements of the 'arr2' array is greater! ");
        }else if (average/5==average2/5){
            System.out.println("The average value of all array elements are equal!");
        }
    }
}
