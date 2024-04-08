package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

/**
 * 2. Создать класс CalculatorWithOperator.
 * 	2.1 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
 * 	2.2 В классе должны присутствовать математические методы:
 * 		2.2.1 4 базовых математических метода (деление, умножение, вычитание, сложение) каждый из этих методов должен принимать два параметра (определитесь с их типами) и должны возвращать результат (определиться с возвращаемым типом результата) при помощи ключевого слово return.
 * 		2.2.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Квадратный корень из числа).
 * 	2.3 В методах можно использовать любые арифметические операторы.
 * 	2.4 Использование библиотеки Math ЗАПРЕЩЕНО! (кроме извлечения корня). Если у Вас плохо с математикой, то для реализации метода "Квадратный корень из числа" можно воспользоваться библиотекой Math.
 * 	2.5 Создать класс CalculatorWithOperatorMain в котором будет точка входа (main метод). В main методе требуется создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1. Вывести в консоль результат.
 */
public class CalculatorWithOperator implements ICalculator {
    public static void main(String[] args) {

    }

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

        return a-b;
    }

    /**
     * Сложение
     */
    public double slozenie (double a, double b){

        return a+b;
    }

    /**
     * Возведение в квадрат
     */
    public double stepen(double a) {
        double c = 1;
        if (a < 0)
            System.out.println(" Введите другое число");
        else {
            c = a * a;
        }
        return c;
    }

    /**
     * Модуль числа
     */
    public double modul (double a) {
        double mod;
        if (a > 0)
            mod = a;
        else mod = a * (-1);
        return mod;
    }

    public double kvadratnyjkoren (double a) {
      return Math.pow(a,0.5);
    }


}
