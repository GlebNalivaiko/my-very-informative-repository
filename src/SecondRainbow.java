import java.util.Random;

public class SecondRainbow {
    public static void main(String[] args){
        int i =new Random().nextInt(1,8);
        System.out.println(i);
        switch (i){
            case 1-> System.out.println("Красный");
            case 2-> System.out.println("Оранжевый");
            case 3-> System.out.println("Жёлтый");
            case 4-> System.out.println("Зелёный");
            case 5-> System.out.println("Голубой");
            case 6-> System.out.println("Синий");
            case 7-> System.out.println("Фиолетовый");

        }
    }
}