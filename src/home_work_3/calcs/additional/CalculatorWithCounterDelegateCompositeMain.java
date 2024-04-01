package home_work_3.calcs.additional;

public class CalculatorWithCounterDelegateCompositeMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoComposite calculatorWithCounterAutoComposite = new CalculatorWithCounterAutoComposite();
        // a = 4.1 + (15 * 7) + (28 / 5)*(28 / 5)
        calculatorWithCounterAutoComposite.delenie(28,5);
         calculatorWithCounterAutoComposite.umnozenie(15,7);

        double a = 4.1  + calculatorWithCounterAutoComposite.umnozenie(15,7) +   calculatorWithCounterAutoComposite.stepen(calculatorWithCounterAutoComposite.delenie(28,5));



        System.out.println(a);
        System.out.println(calculatorWithCounterAutoComposite.getCountOperation());

    }

}
