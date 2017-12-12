public class Main {
    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();

        // before assign a value to attribute, its value is null
        System.out.println("Model is " + porsche.getModel());
        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());

        Account account1 = new Account();
        account1.deposit(1000);
        account1.withdraw(300);
        account1.withdraw(800);
        Account account2 = new Account(1234,2000,
                "Adam","adam@heaven.org","111-111-1111");
    }
}
