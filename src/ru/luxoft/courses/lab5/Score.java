package ru.luxoft.courses.lab5;

public abstract class Score implements MoneyInterface {

    private Account owner;
    private Integer number;
    private Money balance;


    public Score(Account owner, Integer number, Money balance) {
        this.owner = owner;
        this.number = number;
        this.balance = balance;
    }


    protected abstract boolean operationBlocked(double operationUsdAmount);
    protected abstract boolean checkBalance(double operationUsdAmount);
    protected abstract double getBonus(double operationUsdAmount);

    @Override
    public void addMoney(Money money) {
        double usdValueIn = money.getValue() * money.getCurrency().getUsdRate();

        if (operationBlocked(usdValueIn)) {
            System.out.println("Operation blocked!");
            return;
        }

        addBalance(usdValueIn + getBonus(usdValueIn));
    }

    @Override
    public void withdrawMoney(Money money) {

        double usdValueIn = money.getValue() * money.getCurrency().getUsdRate();

        if (operationBlocked(usdValueIn)) {
            System.out.println("Operation blocked!");
            return;
        }

        if(usdValueIn > 30000) {
            throw new IllegalArgumentException
                    (String.format("Maximum withdrawal amount is %.2f%s!",
                            30000 * money.getCurrency().getUsdRate(),
                            money.getCurrency().getName()));
        }

        if(!checkBalance(usdValueIn)) {
            System.out.println("You have no so much!");
            return;
        }

        withdrawBalance(usdValueIn);
    }

    @Override
    public Money balance() {
        return this.balance;
    }

    private void withdrawBalance(double usdAmount) {
        addBalance(-usdAmount);
    }

    private void addBalance(double usdAmount) {
        this.balance.setValue(this.balance.getValue() + usdAmount/getUsdRate());
    }

    protected double usdBalance() {
        return this.balance.getValue() * getUsdRate();
    }

    private float getUsdRate() {
        return this.balance.getCurrency().getUsdRate();
    }


    public Account getOwner() {
        return owner;
    }

    public Integer getNumber() {
        return number;
    }

}
