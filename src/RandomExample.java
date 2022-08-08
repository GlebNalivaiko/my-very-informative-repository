import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        int randomValue = new Random().nextInt(12);
        System.out.println(randomValue);
        if (randomValue % 2 == 0) {
            System.out.println("Чётное");
        }
        if (randomValue % 2 == 1) {
            System.out.println("Нечётное");
        }
    }
}
