public class C2 {
    String[] registrationsArr;

    C2(String[] arr) {
        this.registrationsArr = arr;
    }

    public boolean m() {
        for (int a = 0; a < registrationsArr.length; a++) {
            for(int b = 0; b < registrationsArr.length; b++) {
                if (a != b) {
                    if (registrationsArr[a] == registrationsArr[b]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] v1 = {"test", "aaa", "test"};
        String[] v2 = {"aab", "aac", "aag"};
        System.out.println(new C2(v1).m());
        System.out.println(new C2(v2).m());
    }
}
