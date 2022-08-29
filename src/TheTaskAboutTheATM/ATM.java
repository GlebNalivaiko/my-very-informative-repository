package TheTaskAboutTheATM;

import java.util.Objects;

public class ATM {
    private double amount;
    private final int bill20;
    private final int bill50;
    private final int bill100;
    private String account;

    public String getAccount() {
        return account;
    }

    public double getAmount() {
        return amount;
    }

    public int getBill100() {
        return bill100;
    }

    public int getBill50() {
        return bill50;
    }

    public int getBill20() {
        return bill20;
    }

    public ATM(int amount, String account) {
        this();
        this.amount = amount;
        this.account = account;
        incrementAmount();

    }

    public ATM() {
        this.bill20 = 20;
        this.bill50 = 50;
        this.bill100 = 100;
    }

    public void addUserName() {
        System.out.println("Login completed successfully!\nMoney in the account:" + amount);
    }

    public void addMoney(double money) {
        amount += money;
        System.out.print("The account has been successfully replenished!\nTotal amount:");
        System.out.println(amount);
    }

    private void incrementAmount() {
        this.amount += 1500;
    }

    public void removeMoney(int money) {
        amount -= money;
        System.out.println("You have successfully withdrawn " + money + " dollars!\nAccount balance:" + amount);
        int j = (money - money % 100 - 100) / 100;
        int o = (money - money % 100) / 100;

        switch (money % 100) {
            case 10, 30 ->
                    System.out.println("Issuance in banknotes:" + j + "X100, 1X50, " + (money % 100 + 50) / 20 + "X20");
            case 0, 20, 40, 60, 80 ->
                    System.out.println("Issuance in banknotes:" + o + "X100, " + money % 100 / 20 + "X20");
            case 50, 70, 90 ->
                    System.out.println("Issuance in banknotes:" + o + "X100, 1X50, " + (money % 100) % 50 / 20 + "X20");
        }
    }
}

