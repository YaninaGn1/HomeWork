package home_work_3.calcs.additional;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calculatorWithCounterClassic = new CalculatorWithCounterClassic();
        //double a = 4.1 + (15 * 7) + (28 / 5)
        calculatorWithCounterClassic.delenie(28,5);
        calculatorWithCounterClassic.incrementCountOperration();

        calculatorWithCounterClassic.umnozenie(15,7);
        calculatorWithCounterClassic.incrementCountOperration();

        double a = 4.1  + calculatorWithCounterClassic.umnozenie(15,7) +  calculatorWithCounterClassic.delenie(28,5);
        calculatorWithCounterClassic.incrementCountOperration();

        calculatorWithCounterClassic.stepen(a);
        calculatorWithCounterClassic.incrementCountOperration();

        System.out.println(calculatorWithCounterClassic.stepen(a));
       }
}
