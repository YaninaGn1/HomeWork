package home_work_3.calcs.additional;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
public class CalculatorWithCounterAutoComposite {
    public int schet ;
    public int i = 0;
    CalculatorWithMathCopy calculatorWithMathCopy = new CalculatorWithMathCopy();
    public double delenie (double a, double b){
        calculatorWithMathCopy.delenie(a,b);
        return calculatorWithMathCopy.delenie(a,b);
    }

    /**
     * Умножение
     */
    public double umnozenie (double a, double b){
        calculatorWithMathCopy.umnozenie(a,b);
        return calculatorWithMathCopy.umnozenie(a,b);
    }

    /**
     * Вычитание
     */
    public double vychitanie (double a, double b){
        calculatorWithMathCopy.vychitanie(a,b);
        return calculatorWithMathCopy.vychitanie(a,b);
    }

    /**
     * Сложение
     */
    public double slozenie (double a, double b){
        calculatorWithMathCopy.slozenie(a,b);
        return calculatorWithMathCopy.slozenie(a,b);
    }
    /**
     * Возведение в квадрат
     */
    public double stepen(double a) {
        calculatorWithMathCopy.stepen(a);
        return calculatorWithMathCopy.stepen(a);
    }

    /**
     * Модуль числа
     */
    public int modul (int a) {
        calculatorWithMathCopy.modul(a);
        return calculatorWithMathCopy.modul(a);
    }

    public double kvadratnyjkoren (double a) {
        calculatorWithMathCopy.kvadratnyjkoren(a);
        return calculatorWithMathCopy.kvadratnyjkoren(a);
    }

    public long getCountOperation(){
        schet = i++;
        return schet;
    }
}
