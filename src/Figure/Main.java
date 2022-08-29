package Figure;

public class Main {
    public static void main(String[] args) {
        Figure f = new FigureCircle(5);
        Figure f1 = new FigureRectangle(5, 4);
        Figure f2 = new FigureTriangle(3, 4, 5);
        Figure f3 = new FigureSquare(2, 3);
        Figure f4 = new FigureTrapezoid(2, 4, 3, 2, 7);
        System.out.println("Perimeter of the circle:" + f.getPerimeter() + "\nArea of the circle: " + f.getSquare());
        System.out.println("Rectangle perimeter:" + f1.getPerimeter() + "\nRectangle area " + f1.getSquare());
        System.out.println("The perimeter of the triangle:" + f2.getPerimeter() + "\nThe area of the triangle: " + f2.getSquare());
        System.out.println("The perimeter of the square:" + f3.getPerimeter() + "\nThe area of the square: " + f3.getSquare());
        System.out.println("The perimeter of the trapezoid:" + f4.getPerimeter() + "\nThe area of the trapezoid: " + f4.getSquare());
        Figure[] arr = new Figure[5];
        arr[0] = new FigureTrapezoid(12,2,2,23,4);
        arr[1] = f1;
        arr[2] = f2;
        arr[3] = f3;
        arr[4] = f4;
        double d = 0;
        for (Figure fig : arr) {
            d += fig.getPerimeter();
        }
        System.out.println("Sum of perimeters:" + d);
    }
}
