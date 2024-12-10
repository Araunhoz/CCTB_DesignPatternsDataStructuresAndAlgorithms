class Bank {

    private Customer[] customers = new Customer[10];
    private int numCustomers = 0;

    public void addCustomer(Customer customer) {
        if (numCustomers < 10) {
            customers[numCustomers++] = customer;
            System.out.println("Customer " + customer + " added to Goiabada Bank.");
        } else {
            System.out.println("Goiabada Bank has reached maximum number of customers.");
        }
    }

}
