package Post;

public class Workman implements Speakable{
    private final String name;
    private final int age;
    private final String work;


    public Workman(){
        age=56;
        name="Bob";
        work="Workman";
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
