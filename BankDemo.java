class BankAccount{
    private double balance;

    public BankAccount(double initialBalance){
        balance = initialBalance;
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount){
        if (amount <= balance){
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public double getBalance(){
        return balance;
    }
}

public class BankDemo{
    public static void main(String[] args){
        BankAccount b = new BankAccount(5000);
        b.deposit(2000);
        b.withdraw(3000);
        System.out.println("Current Balance: " + b.getBalance());
    }
}
