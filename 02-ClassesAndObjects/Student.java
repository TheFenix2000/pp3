public class Student {
    String name;
    int age;
    int studentIdCardNumber;
    Boolean isCardValid;
    int semesterNumber;
    double avgGrade;

    public void sayHello() {
        System.out.println("Hello: " + name);
    }

    public void displayName() {
        System.out.print(name);
    }

    public void displayAge() {
        System.out.println(name+ "'s age is " + age);
    }

    public void displayInfo() {
        System.out.println(name + " " + semesterNumber + " " + avgGrade);
    }

    public void changeStatus(Boolean status) {
        isCardValid = !status;
        System.out.println("New status: " + (isCardValid ? "valid" : "invalid"));
    }

    public void displayCard() {
        System.out.println(name + ", card status: " + (isCardValid ? "valid" : "invalid"));
    }
}
