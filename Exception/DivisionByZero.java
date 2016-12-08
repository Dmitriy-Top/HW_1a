package calculator.Exception;

/**
 * Created by admin on 08.12.2016.
 */
public class DivisionByZero extends ArgumentsParseException {
    @Override
    public String getMessage() {
        return "Don't division by ZERO!";
    }
}
