package homework.lesson14;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дату такого формата \"dd-MM-yyyy\" и программа покажет день недели:");
        String time = sc.nextLine();
        DateTimeFormatter simpleDateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        try {
            LocalDate localDate = LocalDate.parse(time, simpleDateFormat);
            System.out.println("День недели:" + localDate.getDayOfWeek());
        } catch (Exception e) {
            System.err.println("Ошибка!\nНеправильный формат даты!");
        }
    }
}
