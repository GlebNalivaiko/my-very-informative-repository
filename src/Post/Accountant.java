package Post;

public class Accountant implements Speakable{
    private final String name;
    private final int age;
    private final String work;


    public Accountant(){
        age=26;
        name="Alice";
        work="Accountant";
    }
    @Override
    public int age() {
        return age;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String work() {
        return work;
    }
}
