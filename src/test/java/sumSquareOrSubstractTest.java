import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class sumSquareOrSubstractTest {
    @Test
    void whenGivenAnumberBiggerThanTheOther(){
        // GIVEN
        int valueA = 5;
        int valueB = 3;
        // WHEN
        int result = calculation.sumSquareOrSubstract(valueA, valueB);
        // THEN
        assertEquals(8, result);
    }
    @Test
    void whenGivenAnumberEqualToTheOther() {
        // GIVEN
        int valueA = 3;
        int valueB = 3;
        // WHEN
        int result = calculation.sumSquareOrSubstract(valueA, valueB);
        // THEN
        assertEquals(9, result);
    }

        @Test
        void whenGivenAnumberSmallerThanTheOther() {
            // GIVEN
            int valueA = 2;
            int valueB = 3;
            // WHEN
            int result = calculation.sumSquareOrSubstract(valueA, valueB);
            // THEN
            assertEquals(6, result);
        }

}
