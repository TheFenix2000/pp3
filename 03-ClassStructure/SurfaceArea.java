public class SurfaceArea {
    float a,b;

    static float rectangle(float a, float b) {
        return a*b;
    }

    static float circle(int r) {
        return (float) (Math.pow(r, 2) * Math.PI);
    }

    static float triangle(int a, int h) {
        return (float) 0.5 * (a * h);
    }
}
