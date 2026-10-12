public class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void credit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " credited successfully.");
        } else {
            System.out.println("Credit amount must be greater than 0.");
        }
    }

    public void debit(double amount) {
        if (amount <= 0) {
            System.out.println("Debit amount must be greater than 0.");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient balance. Unable to debit ₹" + amount);
        } else {
            balance -= amount;
            System.out.println("₹" + amount + " debited successfully.");
        }
    }

    public double calculateSimpleInterest(double rate, int years) {
        return (balance * rate * years) / 100;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: ₹" + balance);
    }
}
