package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calculator = new CalculatorWithCounterClassic();
        double c1 = calculator.plus(4.1, 15);
        calculator.incrementCountOperation();
        double c2 = calculator.multi(c1, 7);
        calculator.incrementCountOperation();
        double b = calculator.split(28, 5);
        calculator.incrementCountOperation();
        double c3 = calculator.powerOf(b,2);
        calculator.incrementCountOperation();
        double c4 = calculator.plus(c2, c3);
        calculator.incrementCountOperation();
        System.out.println(c4);
        System.out.println(calculator.getCountOperation());
    }
}
