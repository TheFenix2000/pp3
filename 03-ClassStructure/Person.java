public class Person {

    // Attributes
    String name;
    double weight; // in kg
    double height; // in cm

    // Constructors
    public Person(String name) {
        this.name = name;
    }

    public Person(String name, double weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    // Method to set weight and height
    public void setWeightAndHeight(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    // Method to calculate BMI
    public double calculateBMI() {
        // BMI formula: weight (kg) / (height (m) * height (m))
        double heightInMeters = height / 100.0;
        return weight / (heightInMeters * heightInMeters);
    }

    // Method to display full information
    public void displayRecord() {
        double bmi = calculateBMI();
        String bmiStatus = getBMIStatus(bmi);

        System.out.println("Name: " + name);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Height: " + height + " cm");
        System.out.println("BMI: " + bmi + " - " + bmiStatus);
        System.out.println();
    }

    // Helper method to get BMI status
    private String getBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "BMI too low";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Normal BMI";
        } else {
            return "BMI too high";
        }
    }

    public static void main(String[] args) {
        // Creating three Person objects
        Person person1 = new Person("John");
        Person person2 = new Person("Alice", 65.5, 170.0);
        Person person3 = new Person("Bob", 80.0, 175.0);

        // Displaying their records
        System.out.println("Person 1's Record:");
        person1.displayRecord();

        System.out.println("Person 2's Record:");
        person2.displayRecord();

        System.out.println("Person 3's Record:");
        person3.displayRecord();
    }
}
