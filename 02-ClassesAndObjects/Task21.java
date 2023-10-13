public class Task21 {
    public static void main(String[] args) {
        int height = 170;

        double feet = height * 0.393700787 / 12;
        double floorFeet = Math.floor(feet);
        String f = String.format("%.0f", floorFeet);

        System.out.print("I'm " + height + "cm tall, i.e. ");
        System.out.print(f + " feet " + (Math.round((feet - floorFeet) * 12)) + " inches");
    }
}
