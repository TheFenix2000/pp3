public class C2 {
    static boolean m(int[] numbers) {
        int sumOfPos = 0;
        int sumOfNegAbs = 0;
        for (int i = 0; i<numbers.length; i++) {
            if (numbers[i] > 0) {
                sumOfPos += numbers[i];
            } else if (numbers[i] < 0) {
                sumOfNegAbs += Math.abs(numbers[i]);
            }
        }
        return sumOfPos > sumOfNegAbs;
    }
    public static void main(String[] args) {
        int[] n1 = {9, 3, 4, -2, -8};
        int[] n2 = {9, 0, 2, -7, 4, -9, 1, -5};
        System.out.println(m(n1));
        System.out.println(m(n2));
    }
}
