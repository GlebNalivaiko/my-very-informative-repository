package Figure;

public class FigureRectangle extends Figure {
   private final int a;
    private final int b;
    public FigureRectangle(int a, int b){
        this.a=a;
        this.b=b;
    }
    public double getPerimeter(){
        return (a+b)*2;
    }

    @Override
    public double getSquare() {
        return a*b;
    }
}
