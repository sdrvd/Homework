package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoAgregationInterface implements ICalculator {

    private long countOperation;
    private final ICalculator calculator;

    public CalculatorWithCounterAutoAgregationInterface(ICalculator calculatorType){
        this.calculator = calculatorType;
    }

    @Override
    public double plus(double a, double b) {
        incrementCountOperation();
        return calculator.plus(a, b);
    }

    @Override
    public double minus(double a, double b) {
        incrementCountOperation();
        return calculator.minus(a, b);
    }

    @Override
    public double multi(double a, double b) {
        incrementCountOperation();
        return calculator.multi(a, b);
    }

    @Override
    public double split(double a, double b) {
        incrementCountOperation();
        return calculator.split(a, b);
    }

    @Override
    public double powerOf(double a, int c) {
        incrementCountOperation();
        return calculator.powerOf(a, c);
    }

    @Override
    public double module(double n) {
        incrementCountOperation();
        return calculator.module(n);
    }

    @Override
    public double squareRoot(double a) {
        incrementCountOperation();
        return calculator.squareRoot(a);
    }

    private void incrementCountOperation(){
        this.countOperation++;
    }

    public long getCountOperation(){
        return this.countOperation;
    }
}
