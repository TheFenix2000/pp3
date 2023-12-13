public class Arrays {
    public static boolean arr(int[] arr1, int[] arr2) {
        int counter1 = numOfTwoDig(arr1);
        int counter2 = numOfTwoDig(arr2);
        return counter1 == counter2;
    }

    private static int numOfTwoDig(int[] arr) {
        int counter = 0;
        for (int i=0;i<arr.length;i++) {
            if (arr[i] >=10 && arr[i] <=99){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int[] arr1 = {15,8,2,37,49,117};
        int[] arr2 = {9,6,7,12,480,4,6,90,5};
        System.out.println(arr(arr1, arr2));
    }
}
