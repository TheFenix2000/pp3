public class C1 {
    private String name;
    private int age;

    C1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public boolean isAdult() {
        return getAge() >= 18;
    }

    @Override
    public String toString() {
        return getName() + "," + getAge();
    }
}
