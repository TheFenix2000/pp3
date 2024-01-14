public class C3 {
    B[] objects;
    C3(B[] bArr) {
        this.objects = bArr;
    }
    public int m() {
        int counter = 0;
        for (B bObj: objects) {
            if (bObj.getB() % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }
    public static void main(String[] args) {
        B[] arr1 = {new B(4), new B(8), new B(6), new B(9)};
        System.out.println(new C3(arr1).m());
        B[] arr2 = {new B(7), new B(9), new B(1)};
        System.out.println(new C3(arr2).m());
    }
}
