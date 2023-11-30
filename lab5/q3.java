package lab5;

// Define custom exceptions InvalidAmountException, InsufficientFundsException to handle
// wrong operations done by customers in deposit, and withdrawal operations.
//  Throw InvalidAmountException if the user enters zero or –ve amount in deposit and
// withdraw operations.
//  Throw InsufficientFundsException if the user enters the amount greater than the
// balance in case of withdrawing operations.

// Custom exception for invalid amount
class InvalidAmountException extends Exception {
    InvalidAmountException(String message) {
        super(message);
    }
}

// Custom exception for insufficient funds
class InsufficientFundsException extends Exception {
    InsufficientFundsException(String message) {
        super(message);
    }
}

// BankAccount class to demonstrate the usage of custom exceptions
class BankAccount {
    private double balance;

    // Method for deposit operation
    void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Invalid amount for deposit. Amount should be greater than zero.");
        }
        balance += amount;
        System.out.println("Deposit successful. New balance: " + balance);
    }

    // Method for withdrawal operation
    void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
        if (amount <= 0) {
            throw new InvalidAmountException("Invalid amount for withdrawal. Amount should be greater than zero.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds. Cannot withdraw more than the available balance.");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. New balance: " + balance);
    }

    // Method to get current balance
    double getBalance() {
        return balance;
    }
}

// Main class to demonstrate the usage of custom exceptions
public class q3 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        try {
            // Attempt to deposit and withdraw with invalid amounts
            account.deposit(1000);
            account.withdraw(-200);  // Should throw InvalidAmountException
            account.deposit(500);

            // Attempt to withdraw with insufficient funds
            account.withdraw(1200);  // Should throw InsufficientFundsException
        } catch (InvalidAmountException | InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

