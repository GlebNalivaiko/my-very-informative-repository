import java.util.Scanner;

public class User {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("What is your name, user:");
        String s = sc.next();
        System.out.println("Hello " + s + "!");
        System.out.print("How are you today?");
        String str = sc.next();
        System.out.println("Keep it up! Have a nice day!");
    }
}
