import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CheckingAccountTest {
    CheckingAccount chkAccount;

    @Before
    public void setup() {
        chkAccount = new CheckingAccount(1000.00);
    }

    @Test
    public void deposit() {
        chkAccount.deposit(200.00);
        Assert.assertEquals(chkAccount.getBalance(), 1200, 0);
    }

    @Test
    public void withdrawal() {
        chkAccount.withdrawal(200.00);
        Assert.assertEquals(chkAccount.getBalance(), 800, 0);
    }
}