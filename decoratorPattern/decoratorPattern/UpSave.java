package decoratorPattern;

public class UpSave implements DecoratorBankAcc {

    private BankAccount bankAcc;

    public UpSave(BankAccount bankAccount) {
        setBankAccount(bankAccount);
    }

    @Override
    public void setBankAccount(BankAccount bankAccount) {
        this.bankAcc = bankAccount;
    }

    @Override
    public String showAccountType() {
        return "UpSave";
    }

    @Override
    public double getInterestRate() {
        return 0.04;
    }

    @Override
    public double getBalance() {
        return bankAcc.getBalance();
    }

    @Override
    public String showBenefits() {
        return bankAcc.showBenefits() + ", With Insurance";
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
