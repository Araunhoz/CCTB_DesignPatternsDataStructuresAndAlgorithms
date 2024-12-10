public class Main {
    public static void main(String[] args) {
        // Create a bank
        Bank goiabadaBank = new Bank();

        // Create a customer
        Customer customer = new Customer("Paulo Jalaska");

        // Add the customer to the bank
        goiabadaBank.addCustomer(customer);

        // Open a savings account with an initial balance of CAD$0.0
        customer.startSavingsAccount(0.0);

        // Make a deposit of CAD$ 100
        customer.makedeposit(100.0);

        // Make a withdrawal of CAD$ 40
        customer.makewithdrawal(40.0);

        // Show the current balance
        customer.showBalance(); // Expected balance: $60
    }


}
