public class CheckingAccount extends Account {

    public CheckingAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amt) {
        super.setBalance(getBalance() + amt);
    }

    @Override
    public void withdrawal(double amt) {
        super.setBalance(getBalance() - amt);
    }
}
