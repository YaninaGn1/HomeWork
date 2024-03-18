package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterClassic  extends CalculatorWithOperator {
    public int schet ;
    public  int i = 0;
    public  void incrementCountOperration(){
      schet = i++;
    }
    public   long getCountperration(){
         return schet;
    }



}
