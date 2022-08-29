package by.teachmeskills.classwork.lesson9;

public class Terapeft extends Doctor {

    @Override
    public void heal(Client client) {
        System.out.println("Hello, I'm a surgeon!\nI'm crashing bones client called " + client.getName());
    }
}
