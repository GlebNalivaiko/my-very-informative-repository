import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args){                // сумма чисел от 1 до ста
        System.out.println("Введите любое число от 1 до 100!\nА я покажу результат ввиде суммы чисел от 1 до этого числа!");
        Scanner sc= new Scanner(System.in);
        double d =sc.nextInt();
        if(d<100 && d>0 ){
            System.out.println("Сумма:"+( d * (++d) /2));
        }else{
            System.out.println("К сожалению, Вы не можете указать число превышающее 100, а также любое отрицательное число и ноль!");
        }
    }
}
