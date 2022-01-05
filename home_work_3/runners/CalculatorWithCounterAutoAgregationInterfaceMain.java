package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoAgregationInterfaceMain {
    public static void main(String[] args) {
        CalculatorWithOperator partOfAgregation = new CalculatorWithOperator();
        CalculatorWithCounterAutoAgregationInterface calculator = new CalculatorWithCounterAutoAgregationInterface(partOfAgregation);
        double c1 = calculator.plus(4.1, 15);
        double c2 = calculator.multi(c1, 7);
        double b = calculator.split(28, 5);
        double c3 = calculator.powerOf(b,2);
        double c4 = calculator.plus(c2, c3);
        System.out.println(c4);
        System.out.println(calculator.getCountOperation());
    }
}
