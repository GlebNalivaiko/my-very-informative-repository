package lesson18.homework;

import java.util.Scanner;

public class WriteInFile {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String nameOfFile = scanner.nextLine();
        Parse.createFactory(nameOfFile);
    }
}
