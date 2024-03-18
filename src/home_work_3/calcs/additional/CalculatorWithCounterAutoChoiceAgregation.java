package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregation {
    public int schet ;
    public int i = 0;
    public CalculatorWithOperator calculator1;
    public CalculatorWithMathCopy calculator2;
    public CalculatorWithMathExtends calculator3;

      public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator calculator) {
        this.calculator1 = calculator;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy calculator) {
        this.calculator2 = calculator;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends calculator) {
        this.calculator3 = calculator;
    }


        public double delenie ( double a, double b) {
            schet = i++;
            if (this.calculator1 == null && this.calculator2 == null) {
                double c = calculator3.delenie(a, b);
            } else if (this.calculator1 == null && this.calculator3 == null) {
                double c = calculator2.delenie(a, b);
            } else {
                double c = calculator3.delenie(a, b);

            }
            return a/b;
        }

            /**
             * Умножение
             */
            public double umnozenie ( double a, double b) {
                schet = i++;
                if (this.calculator1 == null && this.calculator2 == null) {
                    double c = calculator3.umnozenie(a, b);
                } else if (this.calculator1 == null && this.calculator3 == null) {
                    double c = calculator2.umnozenie(a, b);
                } else {
                    double c = calculator3.umnozenie(a, b);

                }
                return a*b;
            }

            /**
             * Вычитание
             */
            public double vychitanie ( double a, double b){
                schet = i++;
                if (this.calculator1 == null && this.calculator2 == null) {
                    double c = calculator3.vychitanie(a, b);
                } else if (this.calculator1 == null && this.calculator3 == null) {
                    double c = calculator2.vychitanie(a, b);
                } else {
                    double c = calculator3.vychitanie(a, b);

                }
                return a-b;
            }

            /**
             * Сложение
             */
            public double slozenie ( double a, double b){
                schet = i++;
                if (this.calculator1 == null && this.calculator2 == null) {
                    double c = calculator3.slozenie(a, b);
                } else if (this.calculator1 == null && this.calculator3 == null) {
                    double c = calculator2.slozenie(a, b);
                } else {
                    double c = calculator3.slozenie(a, b);

                }
                return a+b;
            }

            /**
             * Возведение в квадрат
             */
            public double stepen ( double a){
                schet = i++;
                if (this.calculator1 == null && this.calculator2 == null) {
                    double c = calculator3.stepen(a);
                } else if (this.calculator1 == null && this.calculator3 == null) {
                    double c = calculator2.stepen(a);
                } else {
                    double c = calculator3.stepen(a);

                }
                return a*a;
            }


            /**
             * Модуль числа
             */
            public double modul ( double a){
                schet = i++;
                if (this.calculator1 == null && this.calculator2 == null) {
                    double c = calculator3.modul(a);
                } else if (this.calculator1 == null && this.calculator3 == null) {
                    double c = calculator2.modul(a);
                } else {
                    double c = calculator3.modul(a);

                }
                return Math.abs(a);
            }

            public double kvadratnyjkoren ( double a){
                schet = i++;
                if (this.calculator1 == null && this.calculator2 == null) {
                    double c = calculator3.kvadratnyjkoren(a);
                } else if (this.calculator1 == null && this.calculator3 == null) {
                    double c = calculator2.kvadratnyjkoren(a);
                } else {
                    double c = calculator3.kvadratnyjkoren(a);

                }
                return Math.sqrt(a);
            }

            public long getCountOperation () {
                return schet;
            }

        }

