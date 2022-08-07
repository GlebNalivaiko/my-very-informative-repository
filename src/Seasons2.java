import java.util.Random;

public class Seasons2 {
    public static void main(String[] args) {
        int randomValue = new Random().nextInt(12);
        System.out.println(++randomValue);
        switch (randomValue) {
            case 1, 2, 12:
                System.out.println("Зима");
                break;
            case 3, 4, 5:
                System.out.println("Весна");
                break;
            case 6, 7, 8:
                System.out.println("Лето");
                break;
            case 9, 10, 11:
                System.out.println("Осень");
                break;


        }
    }
}
