public class C5 implements P {
    int[] numbers;

    public C5(int[] arr) {
        this.numbers = arr;
    }

    @Override
    public boolean m() {
        int evenS = 0;
        int oddS = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenS+=number;
            } else {
                oddS += number;
            }
        }
        return evenS == oddS;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 2};
        System.out.println(new C5(arr1).m());
        int[] arr2 = {1, 2, 3, -2};
        System.out.println(new C5(arr2).m());
        int[] arr3 = {2, 3, 6, 7};
        System.out.println(new C5(arr3).m());
        int[] arr4 = {2, 3, 8, 7, 1, 1, 2};
        System.out.println(new C5(arr4).m());
    }
}
