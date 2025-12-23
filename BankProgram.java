public //program for multiple inheritance
    interface Depositable {
        void deposit(double amount);
    }



 // Interface for withdrawal functionality
    interface Withdrawable {
        void withdraw(double amount);
    }
class SavingsAccount implements Depositable, Withdrawable {
        private String accountNumber;
        private double balance;

        public SavingsAccount(String accountNumber, double initialBalance)          {
            this.accountNumber = accountNumber;
            this.balance = initialBalance;
        }
        @Override
        public void deposit(double amount) {
            if (amount > 0) {
                System.out.println("amount Deposited"+amount);
                balance += amount;
                System.out.println(" New balance: " + balance);
            } else {
                System.out.println("Deposit amount must be positive.");
            }
        }

        @Override
        public void withdraw(double amount) {
            if (amount > 0 && balance >= amount) {
                System.out.println("amount withdrawn"+amount);
                balance -= amount;
                System.out.println(" New balance: " + balance);
            } else {
                System.out.println(amount +"can't withdraw Insufficient funds or invalid amount  " );
            }
        }
        public void displayBalance() {
            System.out.println("Account " + accountNumber + " balance: " + balance);
        }
    }
public class BankProgram {
        public static void main(String[] args) {
            SavingsAccount myAccount = new SavingsAccount("SA-12345", 1000.0);

            myAccount.displayBalance();
            myAccount.deposit(500.0);
            myAccount.withdraw(200.0);
            myAccount.displayBalance();
            myAccount.withdraw(1500.0); // Attempt to overdraw
        }
    }
