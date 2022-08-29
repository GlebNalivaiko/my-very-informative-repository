package Computer;
public class Main {
    public static void main(String[] args) {
        Computer c1 = new Computer(3250, "Asus Tuf Gaming");
        Computer c2 = new Computer(4760, "Lenovo Legion 5", 8, 816);
        RAM r = new RAM("RTX", 8);
        HDD h = new HDD("dtsX", 324, "built-in");
        c1.getInfo();
        System.out.println();
        c2.getInfo();
        System.out.println();
        r.getInfo();
        System.out.println();
        h.getInfo();
    }
}
