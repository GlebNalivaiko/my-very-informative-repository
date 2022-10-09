package homework.lesson10;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter the name of the credit card according to the template:xxxx-YYY-xxxx-yyy-yxyx\", where \"y\"-is letter and \"x\"-is number!");
        String documentName = sc.nextLine();
        Pattern correct=Pattern.compile("\\d{4}-[A-Z]{3}-\\d{4}-\\w{3}-\\w\\d\\w\\d");
        Matcher matcher=correct.matcher(documentName);
        if(matcher.matches()){
            Task1.cutToNumbers(documentName);
            Task1.changeTheLetters(documentName);
            Task1.outputOfLetters(documentName);
            Task1.outputByBuilder(documentName);
            Task1.checkingTheSequence(documentName);
            Task1.checkingTheStart(documentName);
            Task1.checkingTheEnd(documentName);
        }else{
            System.out.println("Mistake!");
        }
    }
}
