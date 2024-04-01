package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterDelegateAgregationMain {
    public static void main(String[] args) {

        CalculatorWithCounterAutoAgregation calculatorWithCounterAutoAgregation = new CalculatorWithCounterAutoAgregation( new CalculatorWithMathCopy());

        calculatorWithCounterAutoAgregation.delenie(28,5);

        calculatorWithCounterAutoAgregation.umnozenie(15,7);

        double a = 4.1  + calculatorWithCounterAutoAgregation.umnozenie(15,7) + calculatorWithCounterAutoAgregation.stepen(calculatorWithCounterAutoAgregation.delenie(28,5));

        System.out.println(a);
        System.out.println(calculatorWithCounterAutoAgregation.getCountOperation());

    }
}
