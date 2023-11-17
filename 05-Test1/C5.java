public class C5 {
    int x,y;
    C5(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isX() {
        return y == 0;
    }

    public boolean isY() {
        return x == 0;
    }

    @Override
    public String toString() {
        return String.format("P(%s,%s)", x,y);
    }
}
