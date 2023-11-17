import java.util.Arrays;

public class C3 {
   public static boolean isAlphabet(String t) {
    int n = t.length();
    char[] charA = new char [n];

    for (int i = 0; i < n; i++) {
        charA[i] = t.charAt(i);
    }

    Arrays.sort(charA);

    for (int i = 0; i < n; i++) {
        if (charA[i] != t.charAt(i)) {
            return false;
        }
    }

    return true;
   }

   public static String hideText(String t) {
    char[] chars = t.toCharArray();

    for (int i = 1; i < chars.length - 1; i++) {
        chars[i] = '*';
    }

    return new String(chars);
}

   public static void main(String[] args) {
    System.out.println(C3.isAlphabet("abegsw"));
    System.out.println(C3.isAlphabet("abcmhsw"));
    System.out.println(C3.hideText("apple") );
    System.out.println(C3.hideText("ok") );
   }
}
