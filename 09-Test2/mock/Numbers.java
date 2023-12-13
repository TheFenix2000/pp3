public class Numbers {
    private int[] numbers;

    Numbers (int a, int b, int c, int d, int e) {
        numbers = new int[]{a, b, c, d, e};
    }

    public boolean different() {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    return false; // Found two equal numbers, not all are different
                }
            }
        }
        return true; // All numbers are different
    }
    public static void main(String[] args) {
        Numbers five = new Numbers(3, 4, 2, 1, 6);
        System.out.println(five.different());
        Numbers five2 = new Numbers(9, 7, 4, 3, 7);
        System.out.println(five2.different());
    }
}
