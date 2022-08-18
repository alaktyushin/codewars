package Katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarNumberPlateCalculatorTest {

    @Test
    public void test() {
        assertEquals("aaa004", CarNumberPlateCalculator.findTheNumberPlate(3));
        assertEquals("baa489", CarNumberPlateCalculator.findTheNumberPlate(1487));
        assertEquals("oba041", CarNumberPlateCalculator.findTheNumberPlate(40000));
        assertEquals("zzz999", CarNumberPlateCalculator.findTheNumberPlate(17558423));
        assertEquals("aja802", CarNumberPlateCalculator.findTheNumberPlate(234567));
    }
}