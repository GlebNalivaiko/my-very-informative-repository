public class Sequence {
    public static void main(String[] args){
        System.out.print("Последовательность: ");
        for(int i =0;i<10;i++){
            if(i%2==1){
                System.out.print(i*(-5)+ ",");
            }else{
                System.out.print(i*5+ ",");
            }
        }
    }
}
