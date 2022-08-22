import java.util.Random;
public class SecondTemperature {
    public static void main(String[] args) {
        int i = new Random().nextInt(-30,31);
        System.out.println(i);
        if (i > -5) {
            System.out.println("Тепло");
        }
        if (i <= -20) {
            System.out.println("Холодно");
        }
        if (i <= -5 && i > -20) {
            System.out.println("Нормально");
        }
    }
}
