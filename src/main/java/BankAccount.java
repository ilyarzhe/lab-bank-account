import java.time.LocalDate;

public class BankAccount {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String accountNumber;
    private double balance;
    public BankAccount(String firstName, String lastName,LocalDate dateOfBirth, String accountNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }
    //Getters
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public LocalDate getDateOfBirth(){
        return this.dateOfBirth;
    }
    public String getAccountNumber(){
        return this.accountNumber;
    }
    public double getBalance() {
        return this.balance;
    }
    //Setters
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setDateOfBirth(LocalDate dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setBalance(int balance){
        if (balance<0){
            System.out.println("Can't set a negative balance, choose something else");
        } else {
            this.balance = balance;
        }

    }
    public void deposit(int amount){
        this.balance+=amount;
    }
    public void withdraw(int amount){
        this.balance-=amount;
    }
    public void interest(){
        this.balance*=1.05;

    }
}
