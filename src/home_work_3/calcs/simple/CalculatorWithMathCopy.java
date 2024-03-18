package home_work_3.calcs.simple;

import home_work_3.calcs.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {

    /**
     * Деление
     */
    public double delenie (double a, double b){
        double c = 0;
        if (b == 0)
            System.out.println(" На ноль делить нельзя");
        else
            c = a / b;
        return c;
    }

    /**
     * Умножение
     */
    public double umnozenie (double a, double b){
        double c = a * b;
        return c;
    }

    /**
     * Вычитание
     */
    public double vychitanie (double a, double b){
        double c = a - b;
        return c;
    }

    /**
     * Сложение
     */
    public double slozenie (double a, double b){
        double c = a + b;
        return c;
    }
    /**
     * Возведение в квадрат
     */
    public double stepen(double a) {
        double c = Math.pow(a,2);

        return c;
    }

    /**
     * Модуль числа
     */
    public int modul (int a) {
        int mod = Math.abs(a);
        return mod;
    }

    public double kvadratnyjkoren (double a) {
        double c = Math.pow(a,0.5);
        return c;
    }


}
