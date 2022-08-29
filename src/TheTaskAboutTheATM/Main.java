package TheTaskAboutTheATM;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM a = new ATM(1000, "gleb2005");
        writeUserName(sc, a);
        for (int h = 0; h < 3; h++) {
            System.out.print("If you want to deposit money into the account, press '1', if you want to withdraw, press '2':");
            int i = sc.nextInt();
            switch (i) {
                case 1 -> {
                    System.out.print("Enter the amount you want to deposit:");
                    for (int k = 0; k < 3; k++) {
                        double money = sc.nextInt();
                        if (money % 10 == 0 && money != 10 && money != 30 && money > 0) {
                            a.addMoney(money);
                            break;
                        } else {
                            k = 1;
                            System.out.print("Unfortunately, but the bank accepts banknotes in denominations of 20, 50, 100! Try again:");
                        }
                    }
                }
                case 2 -> {
                    System.out.print("How much money do you want to withdraw:");
                    for (int l = 0; l < 3; l++) {
                        int money1 = sc.nextInt();
                        if (a.getAmount() >= money1 && money1 != 10 && money1 != 30 && money1 > 0 && money1 % 10 == 0) {
                            a.removeMoney(money1);
                            break;
                        } else {
                            l = 1;
                            System.out.print("Unfortunately, the bank issues the amount in denominations of 20, 50, 100!\nYou may have exceeded your bank account! Try again:");
                        }
                    }
                }
                default -> System.out.println("Mistake!");
            }
            System.out.println("If you want to repeat the operation, press '1', if you want to finish the operation, press '2':");
            int d = sc.nextInt();
            switch (d) {
                case 1 -> {
                    h = 1;
                    System.out.println("Good!");
                }
                case 2 -> {
                    System.out.print("Thank you for choosing us!\nHave a nice day!");
                    return;
                }
            }
        }
    }

    private static void writeUserName(Scanner sc, ATM a) {
        System.out.print("ATM welcomes you!\nTo top up your account or withdraw funds, enter your account:");
        String name;
        do{
            name= sc.nextLine();
            System.out.print("Try again:");
        }while(!Objects.equals(name, a.getAccount()));
        a.addUserName();
    }
}
