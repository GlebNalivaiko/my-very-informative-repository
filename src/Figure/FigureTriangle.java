package Figure;

public class FigureTriangle extends Figure {
    private final int a;
    private final int b;
    private final int c;
    public FigureTriangle(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    @Override
    public double getPerimeter() {
        return a+b+c;
    }

    @Override
    public double getSquare() {
        return (int) (a*b/2);
    }
}
