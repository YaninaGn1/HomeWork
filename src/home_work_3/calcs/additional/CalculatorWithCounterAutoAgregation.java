package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoAgregation {
    public CalculatorWithMathCopy calculator1;
    public int schet ;
    public int i = 0;
    public CalculatorWithCounterAutoAgregation(CalculatorWithMathCopy calculator) {
        this.calculator1 = calculator;
    }

      public  double delenie (double a, double b){
          schet = i++;
          double c = calculator1.delenie (a,b);
          return c;

           }

      /**
       * Умножение
       */
      public double umnozenie (double a, double b){
          schet = i++;
          double c = calculator1.umnozenie (a,b);
         return c;
      }

      /**
       * Вычитание
       */
      public double vychitanie (double a, double b){
          schet = i++;
          double c = calculator1.vychitanie (a,b);
          return c;
      }

      /**
       * Сложение
       */
      public double slozenie (double a, double b){
          schet = i++;
          double c = calculator1.slozenie (a,b);
          return c;
      }
      /**
       * Возведение в квадрат
       */
      public double stepen(double a) {
          schet = i++;
          double c = calculator1.stepen (a);
          return c;
      }

      /**
       * Модуль числа
       */
      public int modul (int a) {
          schet = i++;
          int mod = calculator1.modul (a);
          return mod;
      }

      public double kvadratnyjkoren (double a) {
          schet = i++;
          double c = calculator1.kvadratnyjkoren (a);
          return c;
      }
      public long getCountOperation(){
        return schet;
      }
}


