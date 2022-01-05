package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
// (4.1 + 15) * 7 + Math.pow((28 / 5), 2);

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calculator = new CalculatorWithMathCopy();
        double c1 = calculator.plus(4.1,15);
        double c2 = calculator.multi(c1, 7);
        double c3 = calculator.powerOf(calculator.split(28, 5), 2);
        double c4 = calculator.plus(c2, c3);
        System.out.println(c4);
    }
}
