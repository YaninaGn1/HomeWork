package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain  {
    public static void main(String[] args) {
        //double a = 4.1 + (15 * 7) + (28 / 5)*(28 / 5)
        CalculatorWithMathCopy calculatorWithMathCopy = new CalculatorWithMathCopy();

        calculatorWithMathCopy.delenie(28,5);
        calculatorWithMathCopy.umnozenie(15,7);

        double a = 4.1  + calculatorWithMathCopy.umnozenie(15,7) +   calculatorWithMathCopy.stepen(calculatorWithMathCopy.delenie(28,5));


        System.out.println(a);
    }
}
