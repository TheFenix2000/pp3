public class Numbers implements Ok {
    int[] numbers;
    Numbers(int[] array) {
        this.numbers = array;
    }
    @Override
    public boolean ok() {
        for (int i = 0; i < numbers.length; i++) {
            if ((i % 2 == 0 && numbers[i] % 2 != 0) ||(i % 2 != 0 && numbers[i] % 2 == 0)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {6,7,6,1,4};
        int[] arr2 = {2,5,2,8,4};
        Numbers o1 = new Numbers(arr1);
        Numbers o2 = new Numbers(arr2);
        System.out.println(o1.ok());
        System.out.println(o2.ok());
    }
}
