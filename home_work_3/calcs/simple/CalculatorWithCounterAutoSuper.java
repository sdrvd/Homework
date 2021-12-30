package home_work_3.calcs.simple;

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
        double result = a + b;
        incrementCountOperation();
        return result;
    }

    @Override
    public double minus(double a, double b){
        double result = a - b;
        incrementCountOperation();
        return result;
    }

    @Override
    public double multi(double a, double b){
        double result = a * b;
        incrementCountOperation();
        return result;
    }

    @Override
    public double split(double a, double b){
        double result = a / b;
        incrementCountOperation();
        return result;
    }

    @Override
    public double powerOf(double a, int c){

        double result = 1;

        for (int i = 0; i < c; i++) {
            result *= a;
        }

        incrementCountOperation();
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

        incrementCountOperation();
        return result;
    }

    @Override
    public double squareRoot(double a){
        double result = Math.sqrt(a);
        incrementCountOperation();
        return result;
    }
}
