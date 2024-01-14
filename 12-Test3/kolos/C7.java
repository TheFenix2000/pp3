public class C7 {
    int x,y;

    public C7(int valX, int valY) {
        this.x = valX;
        this.y = valY;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public C7 swap() {
        return new C7(y, x);
    }

    public static void main(String[] args) {
        System.out.println(new C7(5, 7).getX());
        System.out.println(new C7(5, 7).getY());
        System.out.println(new C7(5, 7).swap().getX());
        System.out.println(new C7(5, 7).swap().getY());
        System.out.println(new C7(5, 7).swap().swap().getX());
        System.out.println(new C7(5, 7).swap().swap().getY());
    }
}
