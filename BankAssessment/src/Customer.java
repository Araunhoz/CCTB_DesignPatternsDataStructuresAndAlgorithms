class Customer {

    private String name;
    private Account account;

    public Customer(String name) {
        this.name = name;
    }

    public void startSavingsAccount(double initialBalance) {
        this.account = new SavingsAccount(initialBalance);
        System.out.println(name + " opened a savings account - initial balance of CAD$" + initialBalance);
    }

    public void makedeposit(double amount) {
        if (account != null)
            account.makeDeposit(amount);
        else
            System.out.println("Invalid account number.");
    }

    public void makewithdrawal(double amount) {
        if (account != null)
            account.makewithdraw(amount);
        else
            System.out.println("Invalid account number.");
    }

    public void showBalance() {
        if (account != null)
            account.showBalance();
        else
            System.out.println("Invalid account number.");
    }

}
