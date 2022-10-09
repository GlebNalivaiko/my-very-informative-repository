package homework.lesson10;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        String[] arr = "Stats Bob Look At What Eye Cool Radar Dad".toLowerCase().split(" ");
        System.out.println("Write the number of word and I will say is it a palindrome or not:");
        int numberOfWord;
        try {
            Scanner sc = new Scanner(System.in);
            numberOfWord = sc.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("No correct format!");
            return;
        }
        if (numberOfWord >= arr.length || numberOfWord < 0) {
            System.out.println("Mistake!");
            return;
        }
        checkMyWord(numberOfWord, arr);
    }

    public static void checkMyWord(int numberOfWord, String[] arr) {
        char[] arr2 = arr[numberOfWord].toCharArray();
        int count = arr[numberOfWord].length()-1;//почему нельзя arr.length--;//отличие arr.length от arr[numberOfWord].length()-1 в одном случае метод а в другом нет
        for (int i = 0; i < arr[numberOfWord].length(); i++) {
            if (!Objects.equals(arr2[i], arr2[count])) {
                System.out.println(arr[numberOfWord] + " This word is not a palindrome!");
                return;
            }
            if (count == i) {
                System.out.println(arr[numberOfWord] + " This word is a palindrome!");
            }

            count--;
        }
    }
}
