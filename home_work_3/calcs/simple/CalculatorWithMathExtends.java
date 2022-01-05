package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {

    @Override
    public double powerOf(double a, int c){

        double result = 1;

        for (int i = 0; i < c; i++) {
            result *= a;
        }

        return result;
    }

    @Override
    public double module(double n){
        double result = 0;

        if(n > 0){
            result = n;
        }

        if(n < 0){
            result = n * (-1);
        }

        return result;
    }

    @Override
    public double squareRoot(double a){
        double result = Math.sqrt(a);
        return result;
    }

}
