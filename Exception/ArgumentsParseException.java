package calculator.Exception;

/**
 * Created by admin on 08.12.2016.
 */
public class ArgumentsParseException extends ArithmeticOperationsException {
    @Override
    public String getMessage() {
        return "Your arguments is bullshit!";
    }
}
