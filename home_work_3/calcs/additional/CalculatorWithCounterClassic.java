package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends{
    private long countOperation = 0;

    public long getCountOperation() {
        return countOperation;
    }

    public void incrementCountOperation(){
        countOperation++;
    }

}
