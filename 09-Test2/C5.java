public class C5 {
    String[] words;
    C5(String[] words) {
        this.words = words;
    }
    public boolean m() {
        int counter = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i != j) {
                    if (words[i] == words[j]) {
                        counter++;
                    }
                }
            }
        }
        return counter > 0;
    }

    public static void main(String[] args) {
        String[] w1 = {"university", "semester", "student"};
        String[] w2 = {"mouse", "computer", "mouse", "printer"};
        System.out.println(new C5(w1).m());
        System.out.println(new C5(w2).m());
    }
}
