package se.emma.lektioner;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTest {

    CalculatorService cs = new CalculatorService();

    @DisplayName("add")
    @Test
    void additionTest(){

        assertEquals( 0.3, cs.addition(0.1, 0.2));

    }
    @DisplayName("sub")
    @Test
    void subtractTest(){
        assertEquals( 0, cs.subtract(2, 2));
    }
    @DisplayName("multi")
    @Test
    void multiplyTest(){
        assertEquals( 4, cs.multiply(2, 2));

    }
    @DisplayName("div")
    @Test
    void divideTest(){
        assertEquals( -1, cs.divide(2, 0));
    }
}
