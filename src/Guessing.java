import java.util.Random;
import java.util.Scanner;

public class Guessing {
    public static void main(String[] args) {
        int i=new Random().nextInt(1,6);
        Scanner sc=new Scanner(System.in);
        System.out.print("Я загадал число попробуй его отгадать!\nУ тебя есть три попытки:");
        for (byte b=1;b<=3;b++){
            int in=sc.nextInt();
            if(i==in){
                System.out.println("Молодец!\nТак держать!");
            }else {
                switch (b){
                    case 1->System.out.print("Осталось 2 попытки:");
                    case 2->System.out.print("Осталось 1 попытка:");
                    case 3->System.out.println("Конец!");
                }
              }
            }
          }
        }

