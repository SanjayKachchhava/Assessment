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
                ()->assertEquals(5,calculator.Add("2,3"))
        );
    }
}