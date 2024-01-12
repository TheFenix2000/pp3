public class Isogram {
    public static Boolean isogram(String data) {
        for (int i = 0; i < data.length(); i++) {
            for (int j = 0; j < data.length(); j++) {
                if (i != j) {
                    if (data.charAt(i) == data.charAt(j)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(Isogram.isogram("my blue water"));
    }
}
