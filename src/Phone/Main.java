package Phone;

public class Main {
    public static void main(String[] args) {
        Phone p1 = new Phone("+375446576890", "Apple");
        Phone p2 = new Phone("+375290378383", "Nokia");
        Phone p3 = new Phone("+375443567289", "Samsung");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        p1.receiveCall("Bob", "=+375445678499");
        p2.sendMassage("+3754739940320", "Hello");
    }
}
