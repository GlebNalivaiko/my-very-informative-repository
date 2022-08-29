package Phone;


public class Phone {
    private String number;
    private String model;
    private int weight;
    String[] arr;

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {

    }

    public String getNumber() {
        return number;
    }

    public void receiveCall(String name) {
        System.out.println(name + " is calling!");
    }

    public void receiveCall(String name, String telephoneNumber) {
        System.out.println(name + " is calling, telephone number " + telephoneNumber);
    }

    public void sendMassage( String number,String massage) {
        System.out.println("The message has been sent!");
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}

