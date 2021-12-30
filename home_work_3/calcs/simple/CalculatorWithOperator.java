package home_work_3.calcs.simple;

public class CalculatorWithOperator {

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

        double result = 1;

        for (int i = 0; i < c; i++) {
            result *= a;
        }

        return result;
    }

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

    public double squareRoot(double a){
        double result = Math.sqrt(a);
        return result;
    }
}
