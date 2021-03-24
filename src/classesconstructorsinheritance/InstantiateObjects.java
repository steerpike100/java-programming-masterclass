package classesconstructorsinheritance;

public class InstantiateObjects {

    public static void main(String[] args) {
        Account account = new Account();//(12345, 150, "Giles Pip", "giles@pip.com", "01249720126");

        System.out.println("The account number is: " + account.getAccountNumber());
        System.out.println("The balance is: " + account.getBalance());
        System.out.println("The account name is: " + account.getName());
        System.out.println("The email address is: " + account.getEmail());
        System.out.println("The phone number is: " + account.getPhoneNumber());

        account.withdraw(100);
        account.deposit(10);
        account.withdraw(70);

        Account timsAccount = new Account("Tim", "tin@email.com", "01249720126");
        System.out.println(timsAccount.getAccountNumber() + " name " + timsAccount.getName());

        VipCustomer vipCustomer = new VipCustomer();
        System.out.println("The VIP name number is: " + vipCustomer.getName());
        System.out.println("The VIP credit limit is: " + vipCustomer.getCreditLimit());
        System.out.println("The VIP email is: " + vipCustomer.getEmailAddress());

        VipCustomer vip2 = new VipCustomer("steve2", 200.00);
        System.out.println("The VIP name number is: " + vip2.getName());
        System.out.println("The VIP credit limit is: " + vip2.getCreditLimit());
        System.out.println("The VIP email is: " + vip2.getEmailAddress());

        VipCustomer vip3 = new VipCustomer("steve3", 300.00, "steve3@gmail.com");
        System.out.println("The VIP name number is: " + vip3.getName());
        System.out.println("The VIP credit limit is: " + vip3.getCreditLimit());
        System.out.println("The VIP email is: " + vip3.getEmailAddress());

        Wall wall = new Wall(5, 4);
        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.25);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());

        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());

        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
    }
}
