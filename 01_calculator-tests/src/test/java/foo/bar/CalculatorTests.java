package foo.bar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTests {

    @Test
    @DisplayName("1 + 1 = 2")
    void addsTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
        assertEquals(4, calculator.add(2, 2), "2 + 2 should equal 4");
    }
    @Test
    @DisplayName("Extract")
    void extractNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.extract(9, 3), "9 - 3 should equal 6");
    }
    @Test
    @DisplayName("Multiply")
    void multiplyNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(10, calculator.multiply(2, 5), "2 * 5 should equal 10");
    }
    @Test
    @DisplayName("Divide")
    void divideNumbers() {
        Calculator calculator = new Calculator();
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.divide(3,0));
    }
}
