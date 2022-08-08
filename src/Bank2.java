import java.util.Scanner;

public class Bank2 {
    public static void main(String[] args ){
        Scanner sc=new Scanner(System.in);
     System.out.println("Калькулятор");
     System.out.print("Депозит:");
        float f= sc.nextFloat();
     System.out.print("Количество месяцев:");
     float fl= sc.nextFloat();
     float flo=1;
     for(int i=1;i<=fl;i++){
         flo *=1.07f;
     }
     double d =f*flo;
     System.out.println("Сумма:"+ d);
    }
}
