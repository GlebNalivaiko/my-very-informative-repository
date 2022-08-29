package CreditCard;


public class CreditCard {
    private final String account;
    private double amount;

    public String getAccount() {
        return account;
    }

    public double getAmount() {
        return amount;
    }


    public CreditCard(String acc, double amo) {
        this.account = acc;
        this.amount = amo;
    }

    public void showInfoFromAdd() {
        System.out.println("Your account " + getAccount() + ", " + "and your have " + getAmount() + "$. How much money would you wont to add:");
    }

    public void showInfoFromRemove() {
        System.out.println("Your account " + getAccount() + ", " + "and your have " + getAmount() + "$. How much money would you wont to remove:");
    }

    public void addMoney(int money) {
        this.amount += money;
        System.out.println("To the account " + getAccount() + " credited " + money + "$.\nTotal amount:" + this.amount);
    }

    public void removeMoney(double money) {
        if (this.amount >= money) {
            this.amount -= money;
            System.out.println("From the account " + getAccount() + " written off " + money + "$.\nTotal amount:" + this.amount);
        } else {
            System.out.println("Mistake!\nYou haven't money!");
        }
    }
}

