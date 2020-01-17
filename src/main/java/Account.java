public abstract class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public abstract void deposit(double amt);
    public abstract void withdrawal(double amt);

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
