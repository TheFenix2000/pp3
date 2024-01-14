import java.util.Arrays;

public class C6 implements Comparable {
    int[] scores;

    public C6(int[] arr) {
        this.scores = arr;
    }

    public int m() {
        return scores[2];
    }
    //implementacja porównywania tak, by brało element 3 i sortowałomalejaco

    public static void main(String[] args) {
        int[] annaTest = { 8, 7, 5 };
        int[] peterTest = { 10, 6, 4 };
        int[] frankTest = { 3, 9, 7 };

        C6[] s = { new C6(annaTest), new C6(peterTest), new C6(frankTest) };
        System.out.println(s[0].m());
        System.out.println(s[1].m());
        System.out.println(s[2].m());
        Arrays.sort(s);
        System.out.println(s[0].m());
        System.out.println(s[1].m());
        System.out.println(s[2].m());

    }

    @Override
    public int compareTo(Object o) {
        return scores[2];
    }

}
