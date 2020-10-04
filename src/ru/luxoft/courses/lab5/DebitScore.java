package ru.luxoft.courses.lab5;

public class DebetScore extends Score {
    private CreditScore creditScore;
    private Money debetBalance;

    public DebetScore(Money balance, Account owner, Integer number, CreditScore creditScore) {
        super(owner, number);
        this.creditScore = creditScore;
        this.debetBalance = balance;
    }
    public DebetScore(Money balance, Account owner, Integer number) {
        super(owner, number);

    }

    public Money getDebetBalance() {
        return debetBalance;
    }

    public void setDebetBalance(Money debetBalance) {
        this.debetBalance = debetBalance;
    }

    @Override
    public void addMoney(Money money) {
        double usdValueIn = money.getValue() * money.getCurrency().getUsdCource();
        double usdValueThis = this.getDebetBalance().getValue() * this.getDebetBalance().getCurrency().getUsdCource();


        if(checkBefore(usdValueIn)) {
            this.getDebetBalance().setValue((usdValueThis + usdValueIn + (double) 2000) * this.getDebetBalance().getCurrency().getUsdCource());
            System.out.println(usdValueIn);
            System.out.println(usdValueThis);
        } else {
            this.getDebetBalance().setValue((usdValueThis + usdValueIn) * this.getDebetBalance().getCurrency().getUsdCource());
        }

    }

    @Override
    protected boolean checkBefore(double usdValueIn) {
        return usdValueIn > 100000000;
    }

    @Override
    public Money getMoney(double balanceLess) {
        if(balanceLess > 30000) {
            throw new IllegalArgumentException("Wrong balance less!");
        }

        this.getDebetBalance().setValue(this.getDebetBalance().getValue() - balanceLess);

        return this.getDebetBalance();
    }

    @Override
    public Money getMoneyWithoutLess() {
        return this.getDebetBalance();
    }

    public CreditScore getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(CreditScore creditScore) {
        this.creditScore = creditScore;
    }

    @Override
    public String toString() {
        return "DebetScore{" + String.format("%.2f", this.getDebetBalance().getValue())+'}';
    }
}
