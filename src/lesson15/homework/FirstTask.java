package lesson15.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class FirstTask {
    public static void main(String[] args) {
        Random r=new Random();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<20;i++){
            int number= r.nextInt(1,20);
            list.add(number);
        }
        //Stream<Integer> stream=list.stream();/
        //List<Integer> finalList=list.stream().sorted().toList();
        List<Integer> newList= list.stream().distinct().toList();// закрывает стрим и записывает в новый лист newList
        List<Integer> newList2=list.stream().filter(x->x>7).filter(x->x<17).filter(x->x%2==0).collect(Collectors.toList());
        List<Integer> newList3=list.stream().map(x->x*2).collect(Collectors.toList());
        List<Integer> newList4=list.stream().limit(4).toList();
        double newList5=list.stream().mapToDouble(x->x).average().getAsDouble();//getAsDouble Возвращает число, так как мы не знаем есть число вообще или нет
        int count= list.size();//int=показывает что приходит, а (int) показывает что возвращает
        //int count=(int) list.stream().count();//пишем int тк он count по умолчанию пишет в long
        System.out.println("Начальный массив:"+list);
        System.out.println("Лист без повторяющихся элементов:"+newList);
        System.out.println("Лист четных чисел от 7 до 17:"+newList2);
        System.out.println("Лист элементы которого умножены на 2:"+newList3);
        System.out.println("Первые 4 элемента:"+newList4);
        System.out.println("Количество элементов:"+count);
        System.out.println("Среднее значение:"+newList5);


    }
}
