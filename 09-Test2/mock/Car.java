import java.util.Arrays;

public class Car extends Vehicle {
    private int maxSpeed;

    public Car(int seats, int maxSpeed) {
        super(seats);
        this.maxSpeed = maxSpeed;
    }

    public int[] spec() {
        int[] specification = {getSeats(), maxSpeed};
        return specification;
    }

    public static void main(String[] args) {
        // Example usage
        Car myCar = new Car(4, 200);
        int[] carSpec = myCar.spec();

        System.out.println("Car Specification:");
        System.out.println("Number of Seats: " + carSpec[0]);
        System.out.println("Maximum Speed: " + carSpec[1] + " km/h");

        // Print the array using Arrays.toString()
        System.out.println("Car Specification (Array format): " + Arrays.toString(carSpec));
    }
}
