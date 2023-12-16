public class Triangle extends Shape {
    double a,b,c;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double halfPerimeter = (a+b+c)/2;
        double underSqrt = (halfPerimeter-a)*(halfPerimeter - b)*(halfPerimeter - c);
        return Math.sqrt(halfPerimeter * underSqrt);
    }

    @Override
    public double perimeter() {
        return a+b+c;
    }
}
