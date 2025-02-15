package brainacad.org;

import java.util.HashMap;
import java.util.Map;

public class CurrencyConverter {
    private final Map<Currency, Double> exchangeRates;

    public CurrencyConverter() {
        exchangeRates = new HashMap<>();
        exchangeRates.put(Currency.USD, 1.0);   
        exchangeRates.put(Currency.EUR, 0.92);  
        exchangeRates.put(Currency.GBP, 0.78);  
        exchangeRates.put(Currency.JPY, 145.5); 
    }

    public double convert(double amount, Currency from, Currency to) {
        if (!exchangeRates.containsKey(from) || !exchangeRates.containsKey(to)) {
            throw new IllegalArgumentException("Непідтримувана валюта.");
        }

        double amountInUSD = amount / exchangeRates.get(from);
        return amountInUSD * exchangeRates.get(to);
    }
}