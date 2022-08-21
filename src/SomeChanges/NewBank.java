package SomeChanges;

import java.util.Scanner;

public class NewBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Здравствуйте!\nВас приветствует бот Макс из IntelliJ банка!\nВ нашем банке Вы можете сделать вклад под 7% в месяц!\nЧтобы высчитать итоговую сумму через определённое количество месяцев введите 'Да'.\nВ противном случае, программа завершит свою работу! ");
        String st = sc.nextLine();
        switch (st) {
            case "да", "Да", "yes", "Yes" -> System.out.println("Отлично!");
            default -> {
                System.out.println("Хорошего дня!");
                return;
            }
        }
        System.out.print("Сумма вклада: ");
        float depositAmount = sc.nextFloat();
        System.out.print("Количество месяцев: ");
        float numberOfMonths = sc.nextFloat();
        System.out.println("Итоговая сумма:" + depositAmount * Math.pow(1.07f, numberOfMonths));
        System.out.println("Спасибо, что воспользовались услугами нашего банка!\nОцените нашу работу по десятибалльной шкале!");
        byte b = sc.nextByte();// Оценка услуги
        switch (b) {
            case 0, 1, 2, 3 -> System.out.println("Есть над чем поработать!\nСпасибо, что выбрали нас!");
            case 4, 5, 6, 7 -> System.out.println("Спасибо за отзыв!\nМы рады, что Вы выбрали нас!");
            case 8, 9, 10 ->
                    System.out.println("Ого!\nВысокая оценка-это стимул для дальнейшего развития!\nСпасибо, что выбрали нас!");
        }

    }
}


