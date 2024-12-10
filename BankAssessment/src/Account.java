public abstract class Account {

    protected double balance;

    public Account(double initialBalance) {

        this.balance = initialBalance;
    }

    public void makeDeposit(double ammount){
        if (ammount > 0)
            balance = balance + ammount;
        else
            System.out.println("Deposit ammount need to be higher than 0.");
    }

    public void makewithdraw(double ammount) {
        if (ammount > 0 && ammount <= balance)
            balance = balance - ammount;
        else if (ammount <= 0)
            System.out.println("Invalid withdraw ammount");
        else
            System.out.println("Insufficient funds");
    }

    public void showBalance() {

        System.out.printf("Current balance: CAD$ %.2f", balance);
    }

}
