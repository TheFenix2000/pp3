public class Circle extends Shape {
    double r;
    Circle(double r) {
        this.r = r;
    }
    @Override
    public double area() {
        return Math.PI * Math.pow(r, 2);
    }
    @Override
    public double perimeter() {
        return 2 * Math.PI * r;
    }
    
}
