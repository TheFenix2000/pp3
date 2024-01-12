public class Logic {
    boolean[] arr;
    Logic(boolean[] array) {
        this.arr = array;
    }
    int opposite() {
        if (arr.length < 3) {
            return 0;
        }
        int opositeCouter = 0;
        for (int i = 1; i < arr.length-1; i++) {
            if (arr[i-1] == !arr[i] && arr[i+1] == !arr[i]) {
                opositeCouter+=1;
            }
        }
        return opositeCouter;
    }
    public static void main(String[] args) {
        boolean[] arr1 = {true,false,false};
        Logic a1 = new Logic(arr1);
        boolean[] arr2 = {true,false,true, false};
        Logic a2 = new Logic(arr2);
        boolean[] arr3 = {true,false,true,true,false,true,false,true,false};
        Logic a3 = new Logic(arr3);
        System.out.println(a1.opposite());
        System.out.println(a2.opposite());
        System.out.println(a3.opposite());
    }
}