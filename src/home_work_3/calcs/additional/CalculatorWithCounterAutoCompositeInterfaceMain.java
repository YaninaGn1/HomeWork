package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;


public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoAgregationInterface calculatorWithCounterAutoAgregationInterface = new CalculatorWithCounterAutoAgregationInterface( new CalculatorWithMathCopy());
           // a = 4.1 + (15 * 7) + (28 / 5)
         calculatorWithCounterAutoAgregationInterface.delenie(28,5);

        calculatorWithCounterAutoAgregationInterface.umnozenie(15,7);

            double a = 4.1  + calculatorWithCounterAutoAgregationInterface.umnozenie(15,7) +  calculatorWithCounterAutoAgregationInterface.delenie(28,5);

        calculatorWithCounterAutoAgregationInterface.stepen(a);

        System.out.println(calculatorWithCounterAutoAgregationInterface.stepen(a));
        System.out.println(calculatorWithCounterAutoAgregationInterface.getCountOperation());

       }
    }
