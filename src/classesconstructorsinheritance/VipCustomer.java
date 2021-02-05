package classesconstructorsinheritance;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer(){
        this("steve1", 100.00, "steve1@gmail.com");
        System.out.println("Empty constructor called");
    }


    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "steve@gmail.com");
        System.out.println("Account constructor 2 parameters & 1 default called");
    }


    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
        System.out.println("Account constructor 3 parameters called");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }




}
