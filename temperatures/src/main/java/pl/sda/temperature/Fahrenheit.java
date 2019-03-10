package pl.sda.temperature;

import java.math.BigDecimal;

public class Fahrenheit {
    private final BigDecimal VALUE;

    public Fahrenheit(BigDecimal VALUE) {
        if (BigDecimal.valueOf(-459.67).compareTo(VALUE) > 0) {
            throw new IllegalArgumentException("Wrong Value");
        }
        this.VALUE = VALUE;
    }

    public BigDecimal getValue() {
        return VALUE;
    }

    public Celsius toCelsius() {
        return new Celsius(BigDecimal.valueOf(-32).add(VALUE).multiply(BigDecimal.valueOf(5/9)));
    }

    public Kelvin toKelvin() {

        return new Kelvin(BigDecimal.valueOf(459.67).add(VALUE).multiply(BigDecimal.valueOf(5/9)));
    }
}
