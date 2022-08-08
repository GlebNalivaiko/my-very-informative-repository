public class MindTable {
    public static void main(String[] args) {
        System.out.println("Таблица умножения:");
        for (int i = 1; i < 10; i++) {
            switch (i){
                case 1-> System.out.println("Умножение на 1:");
                case 2-> System.out.println("Умножение на 2:");
                case 3-> System.out.println("Умножение на 3:");
                case 4-> System.out.println("Умножение на 4:");
                case 5-> System.out.println("Умножение на 5:");
                case 6-> System.out.println("Умножение на 6:");
                case 7-> System.out.println("Умножение на 7:");
                case 8-> System.out.println("Умножение на 8:");
                case 9-> System.out.println("Умножение на 9:");
            }
            for (int k = 1; k < 10; k++) {
                System.out.println(k +"*"+ i+ "="+ k * i);
            }
        }
        System.out.println("Конец!");
    }
}
