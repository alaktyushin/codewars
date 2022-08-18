package Katas;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class LastDigitOfLargeNumberTest {

    @Test
    public void testSomething() {
        assertEquals(8, LastDigitOfLargeNumber.lastDigit(new BigInteger("2"), new BigInteger("7")));
        assertEquals(4, LastDigitOfLargeNumber.lastDigit(new BigInteger("4"), new BigInteger("1")));
        assertEquals(6, LastDigitOfLargeNumber.lastDigit(new BigInteger("4"), new BigInteger("2")));
        assertEquals(9, LastDigitOfLargeNumber.lastDigit(new BigInteger("9"), new BigInteger("7")));
    }
}