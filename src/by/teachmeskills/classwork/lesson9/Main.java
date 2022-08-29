package by.teachmeskills.classwork.lesson9;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //MedicalPlan m=new MedicalPlan();тоже самое
        //  client.setMedicalPlan(m);

        //get all clients
        Client[] arr = getClients();

        for (Client i : arr) {
            Doctor doctor = DoctorFactory.getDoctorByMedicalPlan(i.getMedicalPlan());
            // get needed doctor
            doctor.heal(i);
        }
    }

    private static Client[] getClients() {
        System.out.println("Write the size of array:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Client[] arr = new Client[size];
        for (int i = 0; i < size; i++) {
            //  Client client = getClient();
            arr[i] = getClient();
        }
        return arr;
    }

    private static Client getClient() {
        // System.out.println("Please write the number of code:");
        // Scanner sc=new Scanner(System.in);
        //int i=sc.nextInt();
        Random r = new Random();
        int i = r.nextInt(4);
        Client client = new Client("Fedor");
        client.setMedicalPlan(new MedicalPlan(i));
        return client;
    }
}
