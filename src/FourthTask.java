import java.util.Scanner;
public class FourthTask {
    public static void main(String[] args) {
        System.out.print("Enter the size of the array:");
        Scanner sc = new Scanner(System.in);
        int numberOfArrays = sc.nextInt();
        for (int i = 0; i < 2; i++) {
            if (numberOfArrays < 5 || numberOfArrays > 10) {
                System.out.println("Repeat the input!");
                int in = sc.nextInt();
                if (in < 5 || in > 10) {
                    i = 0;
                } else {
                    i = 1;
                    System.out.println("Cool!");
                }
            } else {
                System.out.println("Cool!");
                    break;
                }
            }
        }
    }

