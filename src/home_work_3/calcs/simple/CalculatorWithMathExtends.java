package home_work_3.calcs.simple;

public class CalculatorWithMathExtends extends  CalculatorWithOperator{

    /**
     * Наследование метода деление
     * @param a
     * @param b
     * @return
     */
    public double delenie (double a, double b){
       super.delenie(a,b);
        return a / b;
    }

    /**
     * Наследование метода умножение
     * @param a
     * @param b
     * @return
     */
    public double umnozenie (double a, double b){
        super.umnozenie(a,b);
        return a * b;
    }
    /**
     * Наследование метода вычитание
     * @param a
     * @param b
     * @return
     */
    public double vychitanie (double a, double b){
        super.vychitanie(a,b);
        return a - b;
    }
    /**
     * Наследование метода сложение
     * @param a
     * @param b
     * @return
     */
    public double slozenie (double a, double b){
        super.slozenie(a,b);
        return a + b;
    }
    /**
     * Переопределение метода возведение в квадрат
     * @param a
     * @return
     */
    @Override
    public double stepen(double a) {
        double c = Math.pow(a,2);
        return c;
    }
    /**
     * Переопределение метода модуль числа
     * @param a
     * @return
     */
    @Override
    public double modul (double a) {
        double mod = Math.abs(a);
        return mod;
    }
    /**
     * Переопределение метода квадратный корень
     * @param a
     * @return
     */
    @Override
    public double kvadratnyjkoren (double a) {
     double c = Math.pow(a,0.5);
     return c;
    }
}
