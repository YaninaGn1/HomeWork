package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;
public class CalculatorWithCounterAutoAgregationInterface {
    public int schet ;
    public int i = 0;
    public ICalculator calc;
    public CalculatorWithCounterAutoAgregationInterface(ICalculator cal) {
        this.calc = cal;
    }

    public double delenie(double a, double b){
        schet = i++;
        return a/b;
    }


    public double umnozenie(double a, double b){
        schet = i++;
        return a*b;
    }


    public double vychitanie(double a, double b){
        schet = i++;
        return a-b;
    }

    public double slozenie(double a, double b){
        schet = i++;
        return a+b;
    }


    public double stepen(double a){
        schet = i++;
        return a*a;
    }

    public double modul(double a){
        schet = i++;
        return Math.abs(a);
    }

    public double kvadratnyjkoren(double a){
        schet = i++;
        return Math.sqrt(a);
    }
  public long getCountOperation(){
      return schet;
  }
}
