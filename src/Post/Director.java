package Post;

public class Director implements Speakable {
    private final String name;
    private final int age;
    private final String work;


    public Director() {
        age = 33;
        name = "Bob";
        work = "Director";
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
