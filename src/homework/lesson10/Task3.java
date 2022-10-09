package homework.lesson10;

public class Task3 {
    public static void main(String[] args) {
        String[] elements = "ffffff ab 1234 fkfk".split(" ");
        String minValue = elements[0];
        for (String element : elements) {
            if (calculateCharacters(minValue) > calculateCharacters(element)) {
                minValue = element;
            }
        }
        System.out.println(minValue);
    }

    private static int calculateCharacters(String string) {
        StringBuilder existentCharacters = new StringBuilder();
        for (char element : string.toCharArray()) {
            if (!existentCharacters.toString().contains(element + "")) {
                existentCharacters.append(element);//можно через стринг билдер
            }
        }
        return existentCharacters.length();
    }
}
