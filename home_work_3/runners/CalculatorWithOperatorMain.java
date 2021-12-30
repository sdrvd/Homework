package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithOperator;

// (4.1 + 15) * 7 + Math.pow((28 / 5), 2);

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator beta = new CalculatorWithOperator();
        double c1 = beta.plus(4.1, 15);
        double c2 = beta.multi(c1, 7);
        double b = beta.split(28, 5);
        double c3 = beta.powerOf(b,2);
        double c4 = beta.plus(c2, c3);
        System.out.println(c4);
    }
}
