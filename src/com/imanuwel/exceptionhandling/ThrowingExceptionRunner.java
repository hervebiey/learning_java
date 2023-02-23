package com.imanuwel.exceptionhandling;

class Amount {
    private final String currency;
    private int amount;

    public Amount(String currency, int amount) {
        super();
        this.currency = currency;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return amount + " " + currency;
    }

    public void add(Amount that) {
        if (!this.currency.equals(that.currency)) {
            throw new CurrenciesDoNotMatchException("Currencies don't match: " + this.currency + " & " + that.currency);
        }

        this.amount += that.amount;
    }
}

class CurrenciesDoNotMatchException extends RuntimeException {
    public CurrenciesDoNotMatchException(String msg) {
        super(msg);
    }
}

public class ThrowingExceptionRunner {
    public static void main(String[] args) {
        Amount amount1 = new Amount("USD", 10);
        Amount amount2 = new Amount("EUR", 20);

        amount1.add(amount2);
        System.out.println(amount1);
    }
}
