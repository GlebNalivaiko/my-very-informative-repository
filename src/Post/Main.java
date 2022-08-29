package Post;

public class Main {
    public static void main(String[] args) {
        Speakable[] arr = new Speakable[3];
        arr[0] = new Accountant();
        arr[1] = new Director();
        arr[2] = new Workman();
        for (Speakable speakable : arr) {
            System.out.print("Hello, my name is "+speakable.name()+"! ");
            System.out.print("I'm "+speakable.age()+" years old!");
            System.out.println(" And I'm a "+speakable.work()+"!");
        }
    }
}
