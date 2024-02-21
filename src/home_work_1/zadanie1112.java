package home_work_1; // название пакета

import java.util.Scanner; // импорт пакета java.unit

public class zadanie1112 { // название класса

        public static void main(String[] args) { // вызов метода main

            Scanner in = new Scanner(System.in); //.создаем объект класса Scanner
            System.out.print("Input a number1: "); // ввод числа 1 // например 55 в двоичном 110111
            int num1 = in.nextInt(); //присвоить значение переменной num1


            System.out.print("Input a number2: "); // ввод числа 2 // например 14 в двоичном 1110
            int num2 = in.nextInt(); // //присвоить значение переменной num2

            System.out.println("Bitovaya operacitya I:" + (num1 & num2)); // вывод на консоль  "Битовая операция И", расчет самой операции

            System.out.println("Bitovaya operacitya Ili:" + (num1 | num2)); // вывод на консоль  "Битовая операция Или", расчет самой операции

        }
    }

