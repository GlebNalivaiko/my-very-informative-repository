package lesson15.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> list10 = new  ArrayList<>(Arrays.asList("Gleb","Andrey","Gleb","alex","gleb","Slava"));
        int value = (int)list10.stream().filter(x-> x.equalsIgnoreCase("Gleb")).count();
        long element = list10.stream().filter(x-> x.startsWith("a")||x.startsWith("A")).count();
        var first =list10.stream().limit(1).collect(Collectors.toList());
        System.out.println("Слово Глеб встречается в листе:"+value+" раз!");
        System.out.println("Количество слов начинающихся с \"a\":"+element);
        System.out.println("Первый элемент:"+first);
    }
}
