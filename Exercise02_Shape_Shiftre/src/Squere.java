public class Square implements TwoDimensionalShape {
    private double side;

    public Square(double side) {
        this.side = side;
        System.out.println("A new square has been created.");
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }

    public double getSide() {
        return side;
    }
}

