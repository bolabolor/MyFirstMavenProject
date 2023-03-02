import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SmallerThanZeroTest {
    @Test
    void WhenGivenAnumberBiggerThanZero(){
        // GIVEN
        int i = 1;
        // WHEN
        Boolean result = SmallerThanZero.SmallerThanZero(i);
        // THEN
        assertEquals (false, result);
    }

    @Test
    void WhenGiven0ReturnFalse(){
        // GIVEN
        int i = 0;
        // WHEN
        Boolean result = SmallerThanZero.SmallerThanZero(i);
        // THEN
        assertEquals (false, result);
    }
    @Test
    void WhenGivenMinus0ReturnTrue(){
        // GIVEN
        int i = -1;
        // WHEN
        Boolean result = SmallerThanZero.SmallerThanZero(i);
        // THEN
        assertEquals (true, result);
    }
}
