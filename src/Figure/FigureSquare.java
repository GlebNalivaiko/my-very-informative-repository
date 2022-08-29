package Figure;

public class FigureSquare extends Figure {
     private final int a;
     private final int b;

     public FigureSquare(int a,int b){
         this.a=a;
         this.b=b;
     }

    @Override
    public double getPerimeter() {
       return (a+b)*2;
    }

    @Override
    public double getSquare() {
        return a*b;
    }
}
