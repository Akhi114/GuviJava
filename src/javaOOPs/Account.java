package javaOOPs;

public class Account {
    private double balance;

    public Account(){
        this.balance = 0;
    }
    public Account(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: "+amount+" ! Total balance: "+balance);
        }
        else {
            System.out.println("Deposited amount must be more than 0");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <=balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + "! Current Balance: " + balance);
        }else if (amount >balance) {
            System.out.println("Insufficient balance!");
        }else {
            System.out.println("Withdrawal amount must not be 0.");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        
        //account with no balance entry
        Account account_1 = new Account();
        account_1.displayBalance();

        //new account with initial deposit balance
        Account account_2 = new Account(5000);
        account_2.displayBalance();

        //testing deposit method
        account_2.deposit(500);
        account_2.displayBalance();

        //testing withdrawal method
        account_2.withdraw(3000);
        account_2.displayBalance();

        //testing withdrawal insufficient call
        account_2.withdraw(3000);

        //final balance!
        account_2.displayBalance();
    }
}
