package decoratorPattern;

public class SavingsAccount implements BankAccount{

    private String accNum;
    private String accName;
    private double bal;

    public void setAccountNumber(int accountNumber) {
        this.accNum = String.valueOf(accountNumber);
    }

    public void setAccountName(String accountName) {
        this.accName = accountName;
    }

    public void setBalance(double balance) {
        this.bal = balance;
    }

    @Override
    public String showAccountType() {
        return "Savings Account";
    }

    @Override
    public double getInterestRate() {
        return 0.01;
    }

    @Override
    public double getBalance() {
        return bal;
    }

    @Override
    public String showBenefits() {
        return "Standard Savings Account";
    }

    @Override
    public double computeBalanceWithInterest() {
        return (getInterestRate() * bal) + bal;
    }

    @Override
    public String showInfo() {
        String output = "";
        output += "Account Number: " + accNum +
                "\nAccount Name: " + accName +
                "\nBalance: " + bal;
        return output ;
    }
}