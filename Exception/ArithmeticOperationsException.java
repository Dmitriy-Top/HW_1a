package calculator.Exception;

/**
 * Created by admin on 08.12.2016.
 */
public class ArithmeticOperationsException extends CalcException{
    @Override
    public String getMessage() {
        return "Unknown arithmetic operation!";
    }
}
