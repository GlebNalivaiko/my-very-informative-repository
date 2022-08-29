package by.teachmeskills.classwork.lesson9;

public class Dantist extends Doctor{

    @Override
    public void heal(Client client) {
        System.out.println("Hello, I'm a dantist!\nMy name is Bob, I'm look "+client.getName());
    }
}
