package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends calculator = new CalculatorWithMathExtends();
        double c1 = calculator.plus(4.1, 15);
        double c2 = calculator.multi(c1, 7);
        double b = calculator.split(28, 5);
        double c3 = calculator.powerOf(b,2);
        double c4 = calculator.plus(c2, c3);
        System.out.println(c4);
    }
}
