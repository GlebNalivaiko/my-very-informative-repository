package homework.lesson10;

public class Task2 {
    public static void main(String[] args) {
        String str = "   Hello my name is Bod! How are you today? !  I like potato    ";
        String str1 = str.replace("!", "").replace(",", "").replace("?", "").replace(".", "");
        String str2 = str1.trim();
        String[] arr = str2.split(" ");
        int numberOfMaxElement = 0;
        int numberOfMinElement = 0;
        int lengthOfMaxWord = 0;
        int lengthOfMinWord = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j].length() >= lengthOfMaxWord) {
                numberOfMaxElement = j;
                lengthOfMaxWord = arr[j].length();
            }
            if (arr[j].length() <= arr[numberOfMinElement].length() && arr[j].length() != 0) {
                numberOfMinElement = j;
                lengthOfMinWord = arr[j].length();
            }
        }
        System.out.println("The longest word is '" + arr[numberOfMaxElement] + "'! Its length is equal to " + lengthOfMaxWord + "!");
        System.out.println("The shortest word is '" + arr[numberOfMinElement] + "'! Its length is equal to " + lengthOfMinWord + "!");
    }
}
