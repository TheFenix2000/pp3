import java.util.ArrayList;

public class C3 {
    String fullFileName;
    C3(String fullFileName) {
        this.fullFileName = fullFileName;
    }
    public String m1() {
        ArrayList<Character> myList = new ArrayList<>();
        for (Character a : fullFileName.toCharArray()) {
            if (a == '.'){
                myList.add(a);
            }
        }
        return  myList.toString();
    }
    public static void main(String[] args) {
        System.out.println(new C3("myprogram.c").m1());
    }
}
