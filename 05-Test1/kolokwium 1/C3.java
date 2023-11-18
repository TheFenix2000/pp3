public class C3 {
    private int counter = 0;

    public void increase() {
        counter++;
    }

    public void decrease() {
        counter--;
    }

    public void increase(int n) {
        if (n > 0) {
            counter += n;
        }
    }

    public void decrease(int n) {
        if (n > 0) {
            counter -= n;
        }
    }

    public int value() {
        return counter;
    }

    public void cancel() {
        counter = 0;
    }

    public static void main(String[] args) {
        C3 c = new C3();
        System.out.println(c.value());
        c.increase();
        c.increase();
        c.decrease();
        c.increase(5);
        c.increase(-3);
        c.decrease(2);
        System.out.println(c.value());
        c.cancel();
        System.out.println(c.value());
    }
}
