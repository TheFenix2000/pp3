public class C2 {
    private int counter = 0;

    public void increase() {
        counter++;
    }

    public void decrease() {
        counter--;
    }

    public void increase(int n) {
        counter += n;
    }

    public void decrease(int n) {
        counter -= n;
    }

    public int value() {
        return counter;
    }
}
