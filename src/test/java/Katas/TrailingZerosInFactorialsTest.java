package Katas;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class TrailingZerosInFactorialsTest {

    @Test
    void sampleTests() {
        assertEquals(BigInteger.valueOf(3),TrailingZerosInFactorials.trailingZeros(BigInteger.valueOf(15),BigInteger.valueOf(10)));
        assertEquals(BigInteger.valueOf(4),TrailingZerosInFactorials.trailingZeros(BigInteger.valueOf(7),BigInteger.valueOf(2)));
    }
}