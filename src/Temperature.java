import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        System.out.println("Сколько градусов за окном, Глеб?");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i > -5) {
            System.out.println("Тепло");
        }else if (i <= -20) {
            System.out.println("Холодно");
        }else if (i<=-5 && i>-20) {
            System.out.println("Нормально");
        }
    }
}


