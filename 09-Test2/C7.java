public class C7 extends Vehicle {
    private int speed;
    C7(int seats, int speed) {
        super(seats);
        this.speed = speed;
    }

    public int[] spec() {
        return new int[]{getSeats(), speed};
    }

    public static void main(String[] args) {
        C7 o = new C7(4, 140);
        System.out.println( o.spec());
    }
}
