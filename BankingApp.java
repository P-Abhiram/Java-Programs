class InsufficientFundsException extends Exception
 {   //constructor
    public InsufficientFundsException(String message) {
        super(message); // Pass the message to the Exception class constructor
    }
}

// 2. BankAccount Class
class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }
        if (amount > balance) {
            // Throw the custom exception if funds are insufficient
            throw new InsufficientFundsException("Insufficient funds: Cannot withdraw " + amount + ". Available balance: " + balance);
        }
        balance -= amount;
        System.out.println("Withdrew: " + amount + ". New balance: " + balance);
    }
}

// 3. Main Application Class
public class BankingApp {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("ACC001", 1000.0);

        System.out.println("Initial balance for " + account1.getAccountNumber() + ": " + account1.getBalance());

        // Test deposit
        account1.deposit(200.0);

        // Test successful withdrawal
        try {
            account1.withdraw(300.0);
        } catch (InsufficientFundsException e) {
            System.out.println("Error during withdrawal: " + e.getMessage());
        }

        // Test withdrawal with insufficient funds
        try {
            account1.withdraw(1500.0); // This will throw InsufficientFundsException
        } catch (InsufficientFundsException e) {
            System.out.println("Error during withdrawal: " + e.getMessage());
        }

        System.out.println("Final balance for " + account1.getAccountNumber() + ": " + account1.getBalance());
    }
}