package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateChoiceAgregationMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoChoiceAgregation calculatorWithCounterAutoChoiceAgregation = new CalculatorWithCounterAutoChoiceAgregation( new CalculatorWithOperator());
        //double a = 4.1 + (15 * 7) + (28 / 5)*(28 / 5)
        calculatorWithCounterAutoChoiceAgregation.delenie(28,5);

        calculatorWithCounterAutoChoiceAgregation.umnozenie(15,7);

        double a = 4.1  + calculatorWithCounterAutoChoiceAgregation.umnozenie(15,7) +  calculatorWithCounterAutoChoiceAgregation.stepen(calculatorWithCounterAutoChoiceAgregation.delenie(28,5));

        System.out.println(a);
        System.out.println(calculatorWithCounterAutoChoiceAgregation.getCountOperation());


        CalculatorWithCounterAutoChoiceAgregation calculatorWithCounterAutoChoiceAgregation1 = new CalculatorWithCounterAutoChoiceAgregation( new CalculatorWithMathCopy());

        calculatorWithCounterAutoChoiceAgregation1.delenie(28,5);

        calculatorWithCounterAutoChoiceAgregation1.umnozenie(15,7);

        double a1 = 4.1  + calculatorWithCounterAutoChoiceAgregation1.umnozenie(15,7) +  calculatorWithCounterAutoChoiceAgregation1.stepen(calculatorWithCounterAutoChoiceAgregation1.delenie(28,5));

        System.out.println(a1);
        System.out.println(calculatorWithCounterAutoChoiceAgregation1.getCountOperation());


        CalculatorWithCounterAutoChoiceAgregation calculatorWithCounterAutoChoiceAgregation3 = new CalculatorWithCounterAutoChoiceAgregation( new CalculatorWithMathExtends());

        calculatorWithCounterAutoChoiceAgregation3.delenie(28,5);

        calculatorWithCounterAutoChoiceAgregation3.umnozenie(15,7);

        double a3 = 4.1  + calculatorWithCounterAutoChoiceAgregation3.umnozenie(15,7) + calculatorWithCounterAutoChoiceAgregation3.stepen(calculatorWithCounterAutoChoiceAgregation3.delenie(28,5)); ;
        System.out.println(a);
        System.out.println(calculatorWithCounterAutoChoiceAgregation3.getCountOperation());    }
}
