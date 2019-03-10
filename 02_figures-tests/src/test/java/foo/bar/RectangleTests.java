package foo.bar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTests {
    @ParameterizedTest(name = "Area of rectangle({0},{1}) should be {2}")
    @CsvSource({
            "0, 0, 0",
            "1, 1, 1",
            "0, 1, 0"
    })
    void square(int a, int b, int expectedSquare) {
        Rectangle rectangle = new Rectangle(a, b);
        assertEquals(expectedSquare, rectangle.square(a, b));
    }
    @ParameterizedTest(name = "CircumFence of rectangle({0},{1}) should be {2}")
    @CsvSource({
            "0, 0, 0",
            "1, 1, 4",
            "0, 1, 0"
    })
    void circumFerence(int a, int b, int expectedCircum) {
        Rectangle rectangle = new Rectangle(a, b);
        assertEquals(expectedCircum, rectangle.circumference(a, b));
    }
}
