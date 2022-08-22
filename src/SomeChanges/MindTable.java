package SomeChanges;

public class MindTable { public static void main(String[] args) {
    System.out.println("Таблица умножения:");
    for (int i = 1; i < 10; i++) {
      System.out.println("Умножение на "+i+":");
        for (int k = 1; k < 10; k++) {
            System.out.println(k +"*"+ i+ "="+ k * i);
        }
    }
    System.out.println("Конец!");
}
}
