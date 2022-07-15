import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calculator = new Calculator();

        Assertions.assertAll(
                ()->assertEquals(0,calculator.Add("")),
                ()->assertEquals(35,calculator.Add("35")),
                ()->assertEquals(5,calculator.Add("2,3")),
                ()->assertEquals(6,calculator.Add("1,2,3")),
                ()->assertEquals(23,calculator.Add("4,5,6,8")),
                ()->assertEquals(6,calculator.Add("1\n2,3")),
                ()->assertEquals(11,calculator.Add("//;\n1;2;8")),
                ()->assertEquals(12,calculator.Add("//#\n2#2#8"))
        );

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculator.Add("//#\n2#-2#-8");
        });
    }
}