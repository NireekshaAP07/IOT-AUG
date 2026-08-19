class Customer { //creates a class called Customer

    private String name;
    private int accountNumber;
    private double balance;



    Customer(String name , int accountNumber , double balance){
        this.name = name ; //assigns the name parameter to the name instance variable
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    public String getName() {
        return name;
    }


     // Getter for account number
    public int getAccountNumber() {
        return accountNumber;
    }


    // Getter for balance
    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
    this.name = name;
}

    void deposit(double amount) { //method to deposit money into the account
        if(amount>0){
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
        else{
            System.out.println("Invalid deposit amount");
        }
    }


    //method to withdraw money from the account
    void withdraw(double amount) {
        if(amount>0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
        else{
            System.out.println("Invalid withdrawal amount or insufficient balance");
        }
    }   


    void displayDetails() { //method to display customer details
        System.out.println("Customer Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

}