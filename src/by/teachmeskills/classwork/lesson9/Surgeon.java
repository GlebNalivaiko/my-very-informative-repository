package by.teachmeskills.classwork.lesson9;

public class Surgeon extends Doctor {


    @Override
    public void heal(Client client) {
        System.out.println("I'm cutting a part of my client called " + client.getName());
    }
}
