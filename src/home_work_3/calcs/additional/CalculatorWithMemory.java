package home_work_3.calcs.additional;

import home_work_3.calcs.calcs.api.ICalculator;

public class CalculatorWithMemory {
    public ICalculator calc;
    public double save1;
    public double load1;
    public CalculatorWithMemory(ICalculator cal) {
        this.calc = cal;
    }
    public double delenie(double a, double b){
        return save1 = a/b;
    }


    public double umnozenie(double a, double b){
        return save1 = a*b;
    }


    public double vychitanie(double a, double b){
        return save1 = a-b;
    }

    public double slozenie(double a, double b){
        return save1 = a+b;
    }


    public double stepen(double a){
        return save1 = a*a;
    }

    public double modul(double a){
        return save1 = Math.abs(a);
    }

    public double kvadratnyjkoren(double a) {
        return save1 = Math.sqrt(a);
    }
    public void save(){
        save1 = load1;

    }
    public double load(){
       save1 = 0;
       load1 = save1  ;
return load1;
    }
}
