package home_work_3.calcs.additional;



public class CalculatorWithCounterAutoComposite{

    private long countOperation;
    private final CalculatorWithCounterAutoSuper calculator;

    public CalculatorWithCounterAutoComposite() {
        this.calculator = new CalculatorWithCounterAutoSuper();
    }


    public double plus(double a, double b){
        incrementCountOperation();
        return calculator.plus(a, b);
    }

    public double minus(double a, double b){
        incrementCountOperation();
        return calculator.minus(a, b);
    }

    public double multi(double a, double b){
        incrementCountOperation();
        return calculator.multi(a, b);
    }

    public double split(double a, double b){
        incrementCountOperation();
        return calculator.split(a , b);
    }

    public double powerOf(double a, int c){
        incrementCountOperation();
        return calculator.powerOf(a, c);
    }

    public double module(double n){
        incrementCountOperation();
        return calculator.module(n);
    }


    public double squareRoot(double a){
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
