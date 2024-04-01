package home_work_3.calcs.additional;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper calculatorWithCounterAutoSuper = new CalculatorWithCounterAutoSuper();
        //double a = 4.1 + (15 * 7) + (28 / 5)
        calculatorWithCounterAutoSuper.delenie(28,5);

        calculatorWithCounterAutoSuper.umnozenie(15,7);

        double a = 4.1  + calculatorWithCounterAutoSuper.umnozenie(15,7) + calculatorWithCounterAutoSuper.stepen(calculatorWithCounterAutoSuper.delenie(28,5));

        System.out.println(a);
        System.out.println(calculatorWithCounterAutoSuper.getCountOperation());
    }
}
