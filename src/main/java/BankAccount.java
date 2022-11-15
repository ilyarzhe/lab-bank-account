import java.time.LocalDate;

public class BankAccount {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String accountNumber;
    private Double balance;
    private String accountType;
    public BankAccount(String firstName, String lastName,LocalDate dateOfBirth, String accountNumber,String accountType){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = 0.00;
        this.accountType=accountType;
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
    public Double getBalance() {
        return this.balance;
    }
    public String getAccountType(){
        return this.accountType;
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
    public void setBalance(double balance){
        if (balance<0){
            System.out.println("Can't set a negative balance, choose something else");
        } else {
            this.balance = balance;
        }

    }
    public void setAccountType(String accountType){
        this.accountType = accountType;
    }
    public void deposit(int amount){
        this.balance+=amount;
    }
    public void withdraw(int amount){
        this.balance-=amount;
    }
    public void payInterest(){
        if (this.accountType.equals("Savings")){
           this.balance*=1.10;
        } else if (this.accountType.equals("Current")) {
            this.balance*= 1.05;
        }



    }

}
