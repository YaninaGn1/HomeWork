package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends calculatorWithMathExtends = new CalculatorWithMathExtends();
        //double a = 4.1 + (15 * 7) + (28 / 5)*(28 / 5)
        calculatorWithMathExtends.delenie(28,5);
        calculatorWithMathExtends.umnozenie(15,7);

        double a = 4.1  + calculatorWithMathExtends.umnozenie(15,7) +     calculatorWithMathExtends.stepen(calculatorWithMathExtends.delenie(28,5));;


        System.out.println(a);

    }
}
