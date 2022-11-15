import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import java.time.LocalDate;

public class BankAccountTest {
    private BankAccount testAccount;
    @BeforeEach
    public void setUp(){
        testAccount = new BankAccount("Harry","Cheese-man", LocalDate.of(2000,12,5),"58376529","Current");

    }

    @Test
    public void getFirstNameTest(){
        assertThat(testAccount.getFirstName()).isEqualTo("Harry");
    }
    @Test
    public void getLastNameTest(){
        assertThat(testAccount.getLastName()).isEqualTo("Cheese-man");
    }
    @Test
    public void getDateOfBirthTest(){
        assertThat(testAccount.getDateOfBirth()).isEqualTo(LocalDate.of(2000,12,5));

    }

    @Test
    public void getAccountNumberTest(){
        assertThat(testAccount.getAccountNumber()).isEqualTo("58376529");
    }
    @Test
    public void getBalanceTest(){
        assertThat(testAccount.getBalance()).isEqualTo(0);
    }
    @Test
    public void getTypeTest(){
        assertThat(testAccount.getAccountType()).isEqualTo("Current");
    }
    @Test
    public void setFirstNameTest(){
        testAccount.setFirstName("Andrew");
        assertThat(testAccount.getFirstName()).isEqualTo("Andrew");
    }

    @Test
    public void setLastNameTest(){
        testAccount.setLastName("Robertson");
        assertThat(testAccount.getLastName()).isEqualTo("Robertson");
    }
    @Test
    public void setDateOfBirthTest(){
        testAccount.setDateOfBirth(LocalDate.now());
        assertThat(testAccount.getDateOfBirth()).isEqualTo(LocalDate.now());
    }
    @Test
    public void setAccountNumberTest(){
        testAccount.setAccountNumber("23410287");
        assertThat(testAccount.getAccountNumber()).isEqualTo("23410287");
    }
    @Test
    public void setBalanceWithPositiveNumber(){
        int newBalance = 100;
        testAccount.setBalance(newBalance);
        assertThat(testAccount.getBalance()).isEqualTo(newBalance);
    }
    @Test
    public void setBalanceWithNegativeNumber(){
        int newBalance = -10;
        testAccount.setBalance(newBalance);
        assertThat(testAccount.getBalance()).isEqualTo(0);
    }
    @Test
    public void setAccountTypeTest(){
        testAccount.setAccountType("Savings");
        assertThat(testAccount.getAccountType()).isEqualTo("Savings");
    }
    @Test
    public void depositTest(){
        int amount = 10;
        testAccount.deposit(amount);
        assertThat(testAccount.getBalance()).isEqualTo(10);
    }
    @Test
    public void withdrawTest(){
        testAccount.setBalance(100);
        int amount = 10;
        testAccount.withdraw(amount);
        assertThat(testAccount.getBalance()).isEqualTo(90);
    }
    @Test
    public void interestTestWithSavings(){
        testAccount.setBalance(100);
        testAccount.setAccountType("Savings");
        testAccount.payInterest();
        assertThat(testAccount.getBalance()).isEqualTo(100*1.1);
    }
    @Test
    public void interestTestWithCurrent(){
        testAccount.setBalance(500);
        testAccount.payInterest();
        assertThat(testAccount.getBalance()).isEqualTo(500*1.05);
    }

}
