public class Test {
    public static void main(String[] args) {
        System.out.println("RECTANGLE");
        Rectangle rec = new Rectangle(2, 4);
        System.out.println(rec.area());
        System.out.println(rec.perimeter());
        System.out.println("");

        System.out.println("TRIANGLE");
        Triangle tri = new Triangle(4, 6, 7);
        System.out.println(tri.area());
        System.out.println(tri.perimeter());
        System.out.println("");

        System.out.println("CIRCLE");
        Circle cir = new Circle(2);
        System.out.println(cir.area());
        System.out.println(cir.perimeter());
    }
}
