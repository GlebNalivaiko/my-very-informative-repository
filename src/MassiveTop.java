public class MassiveTop {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i*3;
            System.out.print("arr[" + i + "]=" + arr[i] + "; ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i*3;
            if (i % 2 == 1) {
                arr[i] = 0;
            }
            System.out.print("arr[" + i + "]=" + arr[i] + "; ");
        }
    }
}