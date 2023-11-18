public class C5 {
    public static String m(String t) {
        String result = "";
        if (t.length() > 1) {
            char[] a = t.toCharArray();
            result += a[0];
            for (int i=1; i< t.length(); i++) {
                if (i % 2 != 0) {
                    result += "+" + a[i];
                } else {
                    result += "-" + a[i];
                }
            }
        } else {
            return t;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(C5.m("water"));
        System.out.println(C5.m("ok"));
        System.out.println(C5.m("f"));
    }
}
