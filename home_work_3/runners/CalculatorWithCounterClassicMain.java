package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic beta = new CalculatorWithCounterClassic();
        double c1 = beta.plus(4.1, 15);
        beta.incrementCountOperation();
        double c2 = beta.multi(c1, 7);
        beta.incrementCountOperation();
        double b = beta.split(28, 5);
        beta.incrementCountOperation();
        double c3 = beta.powerOf(b,2);
        beta.incrementCountOperation();
        double c4 = beta.plus(c2, c3);
        beta.incrementCountOperation();
        System.out.println(c4);
        System.out.println(beta.getCountOperation());
    }
}
