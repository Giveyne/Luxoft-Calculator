package ru.luxoft.courses.lab5;

import java.util.HashMap;
import java.util.Map;

public class Atm {

    public static void main(String[] args) {

        Account account = new Account(new Principal("Igor", "Ershov", "Vladimirovich", (short) 35), "login", "pass");
        Map<Integer, Score> scoreMap = new HashMap<>();
        Money rur = new Money(CurrencyHolder.getCurrencyByName("RUR"), 1000);
        Money usd = new Money(CurrencyHolder.getCurrencyByName("USD"), 1000);

        CreditScore creditScore = new CreditScore(account, 222, rur);
        DebitScore debitScore = new DebitScore(account, 223, usd);
        account.addScore(creditScore);
        account.addScore(debitScore);

        System.out.println("Начальный акк 1000USD + 1000RUR \n" + account);
        debitScore.withdrawMoney(new Money(CurrencyHolder.getCurrencyByName("USD"), 500));
        System.out.println("Сняли с дебета 500 USD \n" + account);
        creditScore.withdrawMoney(new Money(CurrencyHolder.getCurrencyByName("RUR"), 5000));
        System.out.println("Сняли с кредита 5000RUR \n " + account);
        debitScore.addMoney(new Money(CurrencyHolder.getCurrencyByName("RUR"), 100000));
        System.out.println("Положили 100000 RUR на дебет \n" + account);
        creditScore.addMoney(new Money(CurrencyHolder.getCurrencyByName("RUR"), 1000));
        System.out.println("Положили 1000 RUR на кредит \n" + account);

        debitScore.addMoney(new Money(CurrencyHolder.getCurrencyByName("RUR"), 1000001));
        System.out.println(account);


    }
}
