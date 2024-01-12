import java.util.ArrayList;

public class C1 {
    static int m1(int[] array1, int[] array2) {
        int counter = 0;
        for (int i = 0; i<array1.length; i++) {
            for(int j = 0; j< array2.length; j++) {
                if (array1[i] == array2[j]) {
                    counter++;
                }
            }
        }
        return array1.length - counter;
    }

    static int m2(int[] array1) {
        int maxNum = array1[0];
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i<array1.length;i++) {
            if(array1[i] > maxNum) {
                maxNum = array1[i];
                arr.add(array1[i]);
            }
        }
        System.out.println(arr);
        arr.remove(arr.indexOf(maxNum));
        int newMax = arr.get(0);
        for (int i = 0; i < arr.size();i++) {
            if (arr.get(i) > newMax) {
                newMax = arr.get(i);
            }
        }
        return newMax;
    }

    public static void main(String[] args) {
        int[] n1 = {99,89,78,68,58,48,38,28, 10};
		// int[] n2 = {1,2,3,4,5};
        // System.out.println(m1(n1, n2));
        System.out.println(m2(n1));
    }
}
