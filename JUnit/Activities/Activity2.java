package activities;
import org.junit.jupiter.api.Test;
import activities.BankAccount;
import activities.NotEnoughFundsException;
import static org.junit.jupiter.api.Assertions.*;

public class Activity2 {

    @Test
    void notEnoughFunds() {
        BankAccount account = new BankAccount(10);

        assertThrows(NotEnoughFundsException.class, () -> account.withdraw(20),
                "Balance must be greater than amount of withdrawal");
    }

    @Test
    void enoughFunds() {
        BankAccount account = new BankAccount(100);
    
        assertDoesNotThrow(() -> account.withdraw(100));
    }
}