public class Person {
    String name, surname;
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public String f() {
        String first = name.substring(0, 1).toUpperCase();
        String second = surname.substring(0, 1).toUpperCase();
        return first + second;
    }

    public static void main(String[] args) {
        Person o = new Person("anna", "may");
        System.out.println(o.f());
    }
}
