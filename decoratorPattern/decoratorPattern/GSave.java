package decoratorPattern;

public class GSave implements DecoratorBankAcc {

    private BankAccount bankAcc;

    public GSave(BankAccount bankAccount) {
        setBankAccount(bankAccount);
    }

    @Override
    public void setBankAccount(BankAccount bankAccount) {
        this.bankAcc = bankAccount;
    }

    @Override
    public String showAccountType() {
        return "GSave";
    }

    @Override
    public double getInterestRate() {
        return 0.025;
    }

    @Override
    public double getBalance() {
        return bankAcc.getBalance();
    }

    @Override
    public String showBenefits() {
        return bankAcc.showBenefits() + ", GCash Transfer";
    }

    @Override
    public double computeBalanceWithInterest() {
        double balance = bankAcc.getBalance();
        return (getInterestRate() * balance) + balance;
    }

    @Override
    public String showInfo() {
        return bankAcc.showInfo();
    }

}
