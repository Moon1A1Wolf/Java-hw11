package brainacad.org;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CurrencyConverterTest {
    private final CurrencyConverter converter = new CurrencyConverter();

    @Test
    public void testConvertUsdToEur() {
        double result = converter.convert(100, Currency.USD, Currency.EUR);
        assertEquals(92.0, result, 0.01);
    }

    @Test
    public void testConvertEurToUsd() {
        double result = converter.convert(92, Currency.EUR, Currency.USD);
        assertEquals(100.0, result, 0.01);
    }

    @Test
    public void testConvertGbpToJpy() {
        double result = converter.convert(78, Currency.GBP, Currency.JPY);
        assertEquals(145.5 * 78 / 0.78, result, 0.01);
    }

    @Test
    public void testInvalidCurrency() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> 
            converter.convert(100, null, Currency.USD)
        );
        assertEquals("Непідтримувана валюта.", exception.getMessage());
    }
}