package CreditCard;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard1 = new CreditCard("Gleb2005", 1000);
        CreditCard creditCard2 = new CreditCard("Alex2004", 100);
        CreditCard creditCard3 = new CreditCard("Roman2003", 50);
        creditCardOperations(creditCard1, creditCard2, creditCard3);
    }

    private static void creditCardOperations(CreditCard creditCard1, CreditCard creditCard2, CreditCard creditCard3) {
        Scanner sc = new Scanner(System.in);
        creditCard1.showInfoFromAdd();
        int money = sc.nextInt();
        creditCard1.addMoney(money);
        creditCard2.showInfoFromAdd();
        int money2 = sc.nextInt();
        creditCard2.addMoney(money2);
        creditCard3.showInfoFromRemove();
        int money3 = sc.nextInt();
        creditCard3.removeMoney(money3);
    }
}
