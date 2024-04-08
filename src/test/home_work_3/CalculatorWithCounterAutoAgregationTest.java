package test.home_work_3;


import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorWithCounterAutoAgregationTest {
    @Test
    public void testNull() {
        CalculatorWithCounterAutoAgregation test1 = new CalculatorWithCounterAutoAgregation(new CalculatorWithMathCopy());
        double result = test1.delenie(2, -5);
        Assertions.assertEquals(-0.4, test1.delenie(2, -5));

        double result1 = test1.delenie(2, 5);
        Assertions.assertEquals(0.4, test1.delenie(2, 5));

        double result2 = test1.umnozenie(1, 1.5);
        Assertions.assertEquals(1.5, test1.umnozenie(1, 1.5));


        double result3 = test1.vychitanie(1, 1.5);
        Assertions.assertEquals(-0.5, test1.vychitanie(1, 1.5));

        double result4 = test1.slozenie(1, 1.5);
        Assertions.assertEquals(2.5, test1.slozenie(1, 1.5));

        double result5 = test1.stepen(5);
        Assertions.assertEquals(25, test1.stepen(5));


        double result6 = test1.modul(-5);
        Assertions.assertEquals(5, test1.modul(-5));

        double result7 = test1.kvadratnyjkoren(25);
        Assertions.assertEquals(5, test1.kvadratnyjkoren(25));
    }
}



