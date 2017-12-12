public class Account {
    private int number;
    private double balance;
    private String name;
    private String email;
    private String phone;

    public Account() {
        // this overload a complete constructor to set some default value to an empty temp account
        this(9999,0,"Temp Account","user@org.com","000-000-0000");
        System.out.println("The empty constructor is called, temp account created!");
    }

    public Account(int number, double balance, String name, String email, String phone) {
        this.number = number;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phone = phone;
        System.out.println("New account created!");
        System.out.println("Account Number: " + this.number);
        System.out.println("Account Balance: " + this.balance);
        System.out.println("Account Name: " + this.name);
        System.out.println("Account Email: " + this.email);
        System.out.println("Account Phone: " + this.phone);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void deposit(double value) {
        this.balance += value;
        System.out.println("Deposit succeed! The current balance is:" + this.balance);
    }

    public void withdraw(double value) {
        if(value <= this.balance){
            this.balance -= value;
            System.out.println("Withdraw succeed! The current balance is: " + this.balance);
        } else {
            System.out.println("You balance does not have so much value.");
        }
    }
}
