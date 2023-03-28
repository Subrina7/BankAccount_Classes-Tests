import org.example.BankAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    BankAccount bankAccount;
    @BeforeEach
    public void setUp(){
        bankAccount = new BankAccount("Subrina", "Faisal", "August", 12345);
    }
    @Test
    public void canDepositMoney(){

        bankAccount.deposit(5000);

        assertThat(bankAccount.getBalance()).isEqualTo(5000);
    }


    @Test
    public void canWithdrawMoney(){

        bankAccount.withdraw(100);

        assertThat(bankAccount.getBalance()).isEqualTo(-100);
    }

    @Test
    public void hasFirstName(){

        assertThat(bankAccount.getFirstName()).isEqualTo("Subrina");
    }

    @Test
    public void canSetFirstName(){
         bankAccount.setFirstName("Anna");
         assertThat(bankAccount.getFirstName()).isEqualTo("Anna");
    }

    @Test
    public void hasLastName(){

        assertThat(bankAccount.getLastName()).isEqualTo("Faisal");
    }
    @Test
    public void canSetLastName(){
        bankAccount.setLastName("Brown");
        assertThat(bankAccount.getLastName()).isEqualTo("Brown");
    }

    @Test
    public void hasDateBirth(){

        assertThat(bankAccount.getDateOfBirth()).isEqualTo("August");
    }

    @Test
    public void hasAccountNumber(){
        assertThat(bankAccount.getAccountNumber()).isEqualTo(12345);
    }

    @Test
    public void hasBalance(){
        assertThat(bankAccount.getBalance()).isEqualTo(0);
    }
}

