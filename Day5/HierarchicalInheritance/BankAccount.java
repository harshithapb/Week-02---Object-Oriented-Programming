package HierarchicalInheritance;

class BankAccount {
    private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited $" + amount + " into account " + accountNumber);
        } else {
            System.out.println("Invalid deposit amount for account " + accountNumber);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdrew $" + amount + " from account " + accountNumber);
        } else {
            System.out.println("Invalid withdrawal amount for account " + accountNumber);
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber + ", Balance: $" + balance);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}

// Subclass representing a savings account
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void applyInterest() {
        double interest = getBalance() * (interestRate / 100);
        deposit(interest); // Reuse deposit method from superclass
        System.out.println("Interest of $" + interest + " applied to account " + getAccountNumber());
    }

    @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Account Type: Savings Account, Interest Rate: " + interestRate + "%");
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "interestRate=" + interestRate +
                "} " + super.toString();
    }
}

// Subclass representing a checking account
class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    public CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public double getWithdrawalLimit() {
        return withdrawalLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= withdrawalLimit) {
            super.withdraw(amount); // Reuse withdraw method from superclass
        } else {
            System.out.println("Withdrawal amount exceeds limit for account " + getAccountNumber());
        }
    }

    @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Account Type: Checking Account, Withdrawal Limit: $" + withdrawalLimit);
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "withdrawalLimit=" + withdrawalLimit +
                "} " + super.toString();
    }
}

// Subclass representing a fixed deposit account
class FixedDepositAccount extends BankAccount {
    private int tenure; // in months

    public FixedDepositAccount(int accountNumber, double balance, int tenure) {
        super(accountNumber, balance);
        this.tenure = tenure;
    }

    public int getTenure() {
        return tenure;
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Cannot withdraw from fixed deposit account before maturity for account " + getAccountNumber());
    }

    @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Account Type: Fixed Deposit Account, Tenure: " + tenure + " months");
    }

    @Override
    public String toString() {
        return "FixedDepositAccount{" +
                "tenure=" + tenure +
                "} " + super.toString();
    }

    public static void main(String[] args) {
        // Create instances of each account type
        SavingsAccount savingsAccount = new SavingsAccount(1001, 5000, 3.5);
        CheckingAccount checkingAccount = new CheckingAccount(2002, 3000, 1000);
        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount(3003, 10000, 12);

        // Perform operations and display information
        savingsAccount.displayAccountInfo();
        savingsAccount.deposit(1000);
        savingsAccount.applyInterest();
        savingsAccount.displayAccountInfo();

        checkingAccount.displayAccountInfo();
        checkingAccount.withdraw(500);
        checkingAccount.withdraw(1500); // Exceeds limit
        checkingAccount.displayAccountInfo();

        fixedDepositAccount.displayAccountInfo();
        fixedDepositAccount.withdraw(1000);
        fixedDepositAccount.displayAccountInfo();

        System.out.println(savingsAccount);
        System.out.println(checkingAccount);
        System.out.println(fixedDepositAccount);
    }
}
