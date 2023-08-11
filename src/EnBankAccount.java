//the BankAccount class encapsulates its state using a constructor.
public class EnBankAccount {
    private String accountNumber;
    private double balance;

    // Constructor
    // The constructor ensures that the account number and initial balance are valid
    public EnBankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative");
        }
    }

    // Getter method for 'accountNumber'
    //Getter methods provide read-only access to the private variables
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter method for 'balance'
    public double getBalance() {
        return balance;
    }
}
// This encapsulation prevents external code from directly modifying
// the internal state of the BankAccount object without adhering to the constructor's validation rules.

