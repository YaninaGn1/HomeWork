package home_work_3.calcs.simple;

public class calculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends calculatorWithMathExtends = new CalculatorWithMathExtends();
        //double a = 4.1 + (15 * 7) + (28 / 5)
        calculatorWithMathExtends.delenie(28,5);
        calculatorWithMathExtends.umnozenie(15,7);

        double a = 4.1  + calculatorWithMathExtends.umnozenie(15,7) +  calculatorWithMathExtends.delenie(28,5);

        calculatorWithMathExtends.stepen(a);
        System.out.println(calculatorWithMathExtends.stepen(a));

    }
}
