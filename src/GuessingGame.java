import java.util.Random;
import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args) {
        System.out.print("Я загадал число попробуй его отгадать!\nУ тебя есть три попытки:");
        int in=new Random().nextInt(1,6);
        Scanner sc=new Scanner(System.in);
        for(int g=1;g<=3;g++){
            int i=sc.nextInt();
            if(in==i){
                System.out.println("Молодец!\nТы отгадал число!");
                return;
            }else if (g==1&& in!=i){
                System.out.print("Осталось 2 попытки:");
            }
            else if (g==2&& in!=i){
                System.out.print("Последняя попытка, друг:");
            }else if (g==3){
                System.out.println("К сожалению, ты проиграл!\nЕсли хочешь попробовать ещё раз нажми Run!");
            }
          }
        }
      }