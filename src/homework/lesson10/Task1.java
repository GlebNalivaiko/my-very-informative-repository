package homework.lesson10;

public class Task1 {

    public static void cutToNumbers(String string) {
        String result = string.substring(0, 4);
        result += "/" + string.substring(9, 13);
        System.out.println(result);
    }

    public static void changeTheLetters(String string) {
        String result = string.replace(string.substring(5,8), "***").replace(string.substring(14,17), "***");
        System.out.println(result);
    }

    public static void outputOfLetters(String string) {
        String firstGroup = string.substring(5, 8);
        String secondGroup = string.substring(14, 17);
        String thirdGroup = string.substring(18,19);
        String fourthGroup = string.substring(20, 21);
        String result = String.join("/", firstGroup, secondGroup, thirdGroup, fourthGroup).toLowerCase();
        System.out.println(result);
    }

    public static void outputByBuilder(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        stringBuilder.delete(21, 22).delete(19,20).delete(9,14).delete(0,4);
        stringBuilder.replace( 4,5,"/").replace(8, 9, "/");
        stringBuilder.insert(0, "Letters:");
        System.out.println(stringBuilder);
    }

    public static void checkingTheSequence(String string) {
        String str = string.toLowerCase();
        boolean check = str.contains("abc");
        System.out.println(check);
    }

    public static void checkingTheStart(String string) {
        boolean check = string.startsWith("555");
        System.out.println(check);
    }

    public static void checkingTheEnd(String string) {
        boolean check = string.endsWith("1a2b");
        System.out.println(check);
    }
}

