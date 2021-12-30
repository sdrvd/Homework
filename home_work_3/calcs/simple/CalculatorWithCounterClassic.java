package home_work_3.calcs.simple;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends{
    private long countOperation = 0;

    public long getCountOperation() {
        return countOperation;
    }

    public void incrementCountOperation(){
        countOperation++;
    }

}
