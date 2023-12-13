public class SuperCounter extends Counter {

    public SuperCounter(int initialValue) {
        super(initialValue);
    }

    public void addN(int n) {
        // Increment the counter by n
        for (int i = 0; i < n; i++) {
            add1();
        }
    }

    public static void main(String[] args) {
        // Example usage
        SuperCounter superCounter = new SuperCounter(10);
        System.out.println("Initial Counter Value: " + superCounter.getCounter());

        // Increment the counter by 5
        superCounter.addN(5);
        System.out.println("Counter Value after addN(5): " + superCounter.getCounter());
    }
}
