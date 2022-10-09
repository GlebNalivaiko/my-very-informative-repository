package homework.lesson14;

import java.time.LocalDate;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Дату какого вторника вывести, начиная с этого дня?\nЕсли дату этого вторника взять за \"0\":");
        int valueOfTuesday=sc.nextInt();
        valueOfTuesday*=7;//как задать формат
        //DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate localDate=LocalDate.now();
        int day=0;
        switch (localDate.getDayOfWeek()){
            case FRIDAY ->day=4;
            case SUNDAY -> day=2;
            case MONDAY -> day=1;
            case THURSDAY -> day=5;
            case WEDNESDAY -> day=6;
            case SATURDAY -> day=3;
        }
        LocalDate localDate1=localDate.plusDays(valueOfTuesday+day);
        System.out.println("Дата следующего вторника "+localDate1);
        System.out.println("Сегодняшняя дата:"+localDate);
    }
}
