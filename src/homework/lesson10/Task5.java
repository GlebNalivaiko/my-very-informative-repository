package homework.lesson10;


public class Task5 {
    public static void main(String[] args) {
        String[] arr = "Gleb the best".split(" ");
        System.out.println("This is new string:" + doubleChars(arr));
    }

    /**
     * Этот метод возвращает строку в измененной форме
     * @param string передает строчку из метода main, которую мы создали заранее
     * @return измененная строчка с удвоенными символами
     */
    public static StringBuilder doubleChars(String[] string) {
        StringBuilder newString = new StringBuilder();
        for (String element : string) {
            char[] arr2 = element.toCharArray();
            for (char elements : arr2) {
                newString.append(elements).append(elements);
            }
            newString.append(" ");
        }
        return newString;
    }
}
