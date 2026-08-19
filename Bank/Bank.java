public class Bank {

    public static void main(String[] args) {

        // Creating customer objects

        Customer c1 = new Customer("Nireeksha", 101, 5000);

        Customer c2 = new Customer("Rahul", 102, 8000);

        Customer c3 = new Customer("Anu", 103, 12000);


        // Displaying customer details

        System.out.println("----- Customer 1 -----");

        c1.displayDetails();


        System.out.println();


        System.out.println("----- Customer 2 -----");

        c2.displayDetails();


        System.out.println();


        System.out.println("----- Customer 3 -----");

        c3.displayDetails();


        // Deposit

        System.out.println();

        System.out.println("----- Deposit -----");

        c1.deposit(2000);


        // Display updated balance

        System.out.println("Updated Balance: ₹" + c1.getBalance());


        // Withdrawal

        System.out.println();

        System.out.println("----- Withdrawal -----");

        c2.withdraw(3000);


        // Display updated balance

        System.out.println("Updated Balance: ₹" + c2.getBalance());


        // Changing name using setter

        System.out.println();

        System.out.println("----- Changing Name -----");

        c3.setName("Ananya");

        System.out.println("Updated Name: " + c3.getName());

    }
}