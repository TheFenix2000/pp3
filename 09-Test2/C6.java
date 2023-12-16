import java.util.ArrayList;

public class C6 {
    ArrayList<Person> family = new ArrayList<>();
    public void m1(Person p) {
        family.add(p);
    }

    public int m2() {
        int counter = 0;
        for (Person p : family) {
            if (p.getAge() >= 18) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Person[] people = {
            new Person("Ala", 12),
            new Person("Monika", 22),
            new Person("Darek", 32),
        };
        C6 o = new C6();
        o.m1(people[0]);
        o.m1(people[1]);
        System.out.println(o.m2());
        o.m1(people[2]);
        System.out.println(o.m2());
    }
}
