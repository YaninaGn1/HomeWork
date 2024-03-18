package home_work_3.calcs.simple;

public class CalculatorWithMathCopyMain  {
    public static void main(String[] args) {
        CalculatorWithMathCopy calculatorWithMathCopy = new CalculatorWithMathCopy();

        calculatorWithMathCopy.delenie(28,5);
        calculatorWithMathCopy.umnozenie(15,7);

        double a = 4.1  + calculatorWithMathCopy.umnozenie(15,7) +  calculatorWithMathCopy.delenie(28,5);

        calculatorWithMathCopy.stepen(a);
        System.out.println(calculatorWithMathCopy.stepen(a));
    }
}
