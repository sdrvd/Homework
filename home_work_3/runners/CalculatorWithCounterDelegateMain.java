package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterDelegateMain {
    public static void main(String[] args) {
     calc1();
     calc2();
    }


    public static void calc1(){
        CalculatorWithCounterAutoComposite calculator = new CalculatorWithCounterAutoComposite();
        System.out.println("Композиция");
        double c1 = calculator.plus(4.1, 15);
        double c2 = calculator.multi(c1, 7);
        double b = calculator.split(28, 5);
        double c3 = calculator.powerOf(b,2);
        double c4 = calculator.plus(c2, c3);
        System.out.println(c4);
        System.out.println(calculator.getCountOperation());
    }

    public static void calc2(){
        CalculatorWithMathCopy partOfAgregation = new CalculatorWithMathCopy();
        CalculatorWithCounterAutoAgregation calculator = new CalculatorWithCounterAutoAgregation(partOfAgregation);
        System.out.println("Агрегация");
        double c1 = calculator.plus(4.1, 15);
        double c2 = calculator.multi(c1, 7);
        double b = calculator.split(28, 5);
        double c3 = calculator.powerOf(b,2);
        double c4 = calculator.plus(c2, c3);
        System.out.println(c4);
        System.out.println(calculator.getCountOperation());
    }
}
