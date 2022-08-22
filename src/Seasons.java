import java.util.Random;

public class Seasons {
        public static void main(String[] args) {
            int randomValue = new Random().nextInt(12);
            System.out.println(++randomValue);
            if (randomValue < 3) {
                System.out.println("Зима");
            }
            if (randomValue <6 && randomValue>2) {
                System.out.println("Весна");
            }
            if (randomValue <9 && randomValue>5) {
                System.out.println("Лето");
            }
            if (randomValue <12 && randomValue>8) {
                System.out.println("Осень");
            }
            if (randomValue == 12) {
                System.out.println("Зима");
            }
        }
    }



