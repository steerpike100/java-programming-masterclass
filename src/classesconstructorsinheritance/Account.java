package classesconstructorsinheritance;

public class Account {
    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public Account(){
        this(12345679, 100,"Steve","steve@twat.com", "0124972010");
        System.out.println("Empty constructor called");
    }

    public Account(int accountNumber, int balance, String name, String email, String phoneNumber){
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Account(String name, String email, String phoneNumber) {
        this(99999, 100, name, email, phoneNumber);
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public void deposit(int amount) {
        this.balance += amount;
        System.out.println("Your balance is: " + this.balance);
    }

    public void withdraw(int amount) {
        if (this.balance - amount <=0) {
            System.out.println("You have insufficient funds. Your balance is: " + this.balance + " and you requested: " + amount);
        } else {
            this.balance -= amount;
            System.out.println(" You have withdrawn " + amount + " . Your remaining balance is " + this.balance);
        }

    }

}
