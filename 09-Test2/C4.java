import java.util.ArrayList;

public class C4 {
    int[] votes;
    C4(int[] votes) {
        this.votes = votes;
    }

    public int m() {
        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 0; i< votes.length; i++) {
            myList.add(votes[i]);
        }
        myList.sort(null);
        myList.remove(0);
        myList.remove(myList.size() - 1);
        
        int s = 0;
        for (Integer i : myList) {
            s += i;
        }
        return s;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{4, 5, 3, 3, 5, 2 , 2, 4};
        int[] ar2 = new int[]{1, 3, 2, 4};
        C4 o = new C4(arr);
        C4 o2 = new C4(ar2);
        System.out.println(o.m());
        System.out.println(o2.m());
    }
}
