package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterDelegateAgregationMain {
    public static void main(String[] args) {

        CalculatorWithCounterAutoAgregation calculatorWithCounterAutoAgregation = new CalculatorWithCounterAutoAgregation( new CalculatorWithMathCopy());

        // a = 4.1 + (15 * 7) + (28 / 5)
        calculatorWithCounterAutoAgregation.delenie(28,5);

        calculatorWithCounterAutoAgregation.umnozenie(15,7);

        double a = 4.1  + calculatorWithCounterAutoAgregation.umnozenie(15,7) +  calculatorWithCounterAutoAgregation.delenie(28,5);

        calculatorWithCounterAutoAgregation.stepen(a);

        System.out.println(calculatorWithCounterAutoAgregation.stepen(a));
        System.out.println(calculatorWithCounterAutoAgregation.getCountOperation());

    }
}
