// BankAccount class
// This class has instance variables for the account number, password and balance, and methods
// to withdraw, deposit, check balance etc.

// This class contains methods which you need to complete to make the basic ATM work.
// Tutors can help you get this part working in lab sessions. 

// If you choose the ATM for your project, you should make other modifications to 
// the system yourself, based on similar examples we will cover in lectures and labs.
public class BankAccount
{
    public int accNumber = 0;
    public int accPasswd = 0;
    public int balance = 0;
    
    public BankAccount()
    {
    }
    
    public BankAccount(int a, int p, int b)
    {
        accNumber = a;
        accPasswd = p;
        balance = b;
    }
    
    // withdraw money from the account. Return true if successful, or 
    // false if the amount is negative, or less than the amount in the account 
    public boolean withdraw( int amount ) 
    { 
        // Check if the requested amount is negative
        if (amount < 0) {
            // If the amount is negative, log a debug message and return false, indicating the operation failed
            Debug.trace("BankAccount::withdraw: failed, requested amount is negative =" + amount);
            return false;
        } else {
            // If the amount is positive, check whether the balance is sufficient for the withdrawal
            if(amount <= balance){
                // If the balance is sufficient, subtract the amount from the balance
                balance -= amount;
                // Log a debug message indicating that the withdrawal operation was successful
                Debug.trace("BankAccount::withdraw: approved.");
                return true;
            } else {
                // If the balance is not sufficient, log a debug message indicating the withdrawal
                // operation failed
                Debug.trace("BankAccount::withdraw: failed, insufficient balance.");
                return false;
            }
        }
    }
    
    // deposit the amount of money into the account. Return true if successful,
    // or false if the amount is negative 
    public boolean deposit(int amount) {
        // Log a debug message indicating the amount that is being deposited.
        Debug.trace("BankAccount::deposit: amount = " + amount);
        // Check if the deposit amount is negative.
        if (amount < 0) {
            // If the deposit amount is negative, log a debug message and return false.
            Debug.trace("BankAccount::deposit: failed, amount is negative = " + amount);
            return false;
        } else {
            // If the deposit amount is positive, add it to the balance and log a debug message.
            balance += amount;
            Debug.trace("BankAccount::deposit: success, new balance is = " + balance);
            return true;
        }
    }

    // Return the current balance in the account
    public int getBalance() {
        // Logs a debug message indicating that the getBalance method has been invoked.
        Debug.trace("BankAccount::getBalance");
        // Returns the current balance.
        return balance;
    }
}
