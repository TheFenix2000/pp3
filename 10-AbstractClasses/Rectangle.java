public class Rectangle extends Shape {
    double a,b;
    Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public double area() {
        return a * b;
    }
    @Override
    public double perimeter() {
        return 2*a + 2*b;
    }
}
