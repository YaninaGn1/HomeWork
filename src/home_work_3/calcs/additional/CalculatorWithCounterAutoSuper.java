package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends  CalculatorWithMathExtends{
    public int schet ;
    public int i = 0;
    /**
            * Переопределение метода деление
     * @param a
     * @param b
     * @return
             */
  public double delenie (double a, double b){
      schet = i++;
      super.delenie(a,b);
      return super.delenie(a,b);
  }
    /**
     * Переопределение метода умножение
     * @param a
     * @param b
     * @return
     */
    public double umnozenie (double a, double b){
        schet = i++;
        super.umnozenie(a,b);
        return super.umnozenie(a,b);
    }
    /**
     * Переопределение метода вычитание
     * @param a
     * @param b
     * @return
     */
    public double vychitanie (double a, double b){
        schet = i++;
        super.vychitanie(a,b);
        return super.vychitanie(a,b);
    }
    /**
     * Переопределение метода сложнение
     * @param a
     * @param b
     * @return
     */
    public double slozenie (double a, double b){
        schet = i++;
        super.slozenie(a,b);
        return super.slozenie(a,b);
    }
    /**
     * Переопределение метода возведение в квадрат
     * @param a
     * @return
     */
    public double stepen(double a) {
        schet = i++;
        super.stepen(a);
        return super.stepen(a);
    }
    /**
     * Переопределение метода модуль числа
     * @param a
     * @return
     */
    public int modul (int a) {
        schet = i++;
        super.modul(a);
        return super.modul(a);
    }
    /**
     * Переопределение метода квадратный корень
     * @param a
     * @return
     */
    public double kvadratnyjkoren (double a) {
        schet = i++;
        super.kvadratnyjkoren(a);
        return super.kvadratnyjkoren(a);
    }
public long getCountOperation(){
        return schet;
}
}
