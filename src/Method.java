public class Method {
    public static void testMethod(int value) {
        testMethod(value - 1);
    }

    public static int fib(int position) {
        if (position == 0) {
            return 0;
        }
        if (position == 1) {
            return 1;
        }
        return fib(position - 1) + fib(position - 2);
    }
}
