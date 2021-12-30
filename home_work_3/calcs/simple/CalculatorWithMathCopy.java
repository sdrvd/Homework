package home_work_3.calcs.simple;

public class CalculatorWithMathCopy {


    public double plus(double a, double b){
        double result = a + b;
        return result;
    }

    public double minus(double a, double b){
        double result = a - b;
        return result;
    }

    public double multi(double a, double b){
        double result = a * b;
        return result;
    }

    public double split(double a, double b){
        double result = a / b;
        return result;
    }

    public double powerOf(double a, int c){
        double result = Math.pow(a, c);
        return result;
    }

    public double module(double n){
        double result = Math.abs(n);
        return result;
    }

    public double squareRoot(double a){
        double result = Math.sqrt(a);
        return result;
    }
}
