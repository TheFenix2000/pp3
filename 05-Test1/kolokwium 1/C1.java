public class C1 {

    public static int different(int[] array1, int[] array2) {
        int counter = 0;
        for (int i: array1) {
            for (int j: array2) {
                if (i == j) {
                    counter++;
                }
            }
        }

        return array1.length - counter;
    }

    public static int secondMax(int[] array) {
        int maxim = array[0];
        int second = array[0];
        for (int i = 0; i < array.length; i++) {

            if (array[i] > maxim) {
                maxim = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {

            if (array[i] > second && array[i] < maxim) {
                second = array[i];
            }
        }
        return second;
    }

    public static void main(String[] args) {
        int[] arr1 = {22, 33, 44, 55};
        int[] arr2 = {44, 55, 66, 77, 88, 99};
        System.out.println(C1.different(arr1, arr2));
        System.out.println(C1.secondMax(arr2));
    }
}