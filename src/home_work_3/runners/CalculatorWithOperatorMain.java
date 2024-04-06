package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        //a = 4.1 + (15 * 7) + (28.0 / 5)*(28.0 / 5);
        CalculatorWithOperator сalculatorWithOperator = new CalculatorWithOperator ();
        сalculatorWithOperator.delenie(28,5);
        сalculatorWithOperator.umnozenie(15,7);

       double a = 4.1  + сalculatorWithOperator.umnozenie(15,7) +  + сalculatorWithOperator.stepen(сalculatorWithOperator.delenie(28,5) ) ;

        System.out.println(a);
    }
}
