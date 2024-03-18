package home_work_3.calcs.simple;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator сalculatorWithOperator = new CalculatorWithOperator ();
        сalculatorWithOperator.delenie(28,5);
        сalculatorWithOperator.umnozenie(15,7);

       double a = 4.1  + сalculatorWithOperator.umnozenie(15,7) +  сalculatorWithOperator.delenie(28,5);

        сalculatorWithOperator.stepen(a);
        System.out.println(сalculatorWithOperator.stepen(a));
    }
}
