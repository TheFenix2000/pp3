public class StudentTest {
    public static void main(String[] args) {
        
        // object creation
        Student student1 = new Student();
        Student student2 = new Student();
        
        // object manipulation
        student1.name = "Peter";
        student2.name = "Jack";

        student1.age = 21;
        student2.age = 22;

        System.out.println(student1.name + " " + student1.age);
        student1.sayHello();
        student2.displayAge();

        System.out.println("\n----------ZAD 19----------");

        student1.isCardValid = false;

        System.out.println(student1.isCardValid);
        student1.changeStatus(true);
        System.out.println(student1.isCardValid);

        student1.avgGrade = 4.2;
        student2.isCardValid = false;

        student1.semesterNumber = 123456;
        student1.displayInfo();
        student2.displayCard();

    }

}
