import java.util.Arrays;

public class C4 {
    String[] animals;

    C4(String[] a) {
        this.animals = a;
    }

    public C4 m1(char c) {
        String[] filteredAnimals = Arrays.stream(animals)
        .filter(animal -> animal.indexOf(c) != -1)
        .toArray(String[]::new);
        return new C4(filteredAnimals);
    }

    public String m2() {
        if (animals.length == 0) {
            return "";
        }
        return String.join("", animals);
    }

    public static void main(String[] args) {
        String[] animals = {"tiger","cow","lion","elephant","cat","crocodile"};
        System.out.println(new C4(animals).m2());
        System.out.println(new C4(animals).m1('e').m2());
        System.out.println(new C4(animals).m1('x').m2());
    }
}
