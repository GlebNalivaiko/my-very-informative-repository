package Figure;

public class FigureTrapezoid extends Figure {
    private final int a;
    private final int b;
    private final int h;
    private final int c;
    private final int d;
    public FigureTrapezoid(int a,int b,int h,int c,int d){
        this.a=a;
        this.b=b;
        this.h=h;
        this.c=c;
        this.d=d;
    }

    @Override
    public double getPerimeter() {
        return a+b+c+d;
    }

    @Override
    public double getSquare() {
        return (a+b)/2*h;
    }
}
