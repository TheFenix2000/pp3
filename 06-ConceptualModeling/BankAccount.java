public class BankAccount {
    private int balance;

    public void deposit(int n) {
        balance += n;
        System.out.println("Deposited: " + n);
    }

    public void display() {
        System.out.println("Account balance: " + balance);
    }

    public void withdraw(int n) {
        if (n > 500) {
            System.out.println("Error: withdrawn limit exceeded");
            return;
        }
        if (balance >= n) {
            balance -= n;
            System.out.println("Withdrawn: " + n);
        } else {
            System.out.println("Error: insufficient funds");
        }
    }

    public static void main(String[] args) {
    	BankAccount o = new BankAccount();
        o.deposit(500);
        o.display();   
        o.deposit(200);
        o.withdraw(300);
        o.display();
        o.withdraw(200);
        o.withdraw(600);
        o.withdraw(400);

    }
}