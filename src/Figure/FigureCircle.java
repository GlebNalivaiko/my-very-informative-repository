package Figure;

public class FigureCircle extends Figure {
    private final double radius;

    public FigureCircle(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public double getSquare() {
        return Math.PI * Math.pow(radius, 2);
    }
}
