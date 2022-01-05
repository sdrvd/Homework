package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends{
    private long countOperation = 0;

    public long getCountOperation() {
        return countOperation;
    }

    public void incrementCountOperation(){
        countOperation++;
    }

    @Override
    public double plus(double a, double b){
        incrementCountOperation();
        return super.plus(a, b);
    }

    @Override
    public double minus(double a, double b){
        incrementCountOperation();
        return super.minus(a, b);
    }

    @Override
    public double multi(double a, double b){
        incrementCountOperation();
        return super.multi(a, b);
    }

    @Override
    public double split(double a, double b){
        incrementCountOperation();
        return super.split(a , b);
    }

    @Override
    public double powerOf(double a, int c){
        incrementCountOperation();
        return super.powerOf(a, c);
    }

    @Override
    public double module(double n){
        incrementCountOperation();
        return super.module(n);
    }

    @Override
    public double squareRoot(double a){
        incrementCountOperation();
        return super.squareRoot(a);
    }
}
