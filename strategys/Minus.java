package calculator.strategys;

import static calculator.Decorator.doubleDecorate;

/**
 * Created by admin on 27.10.2016.
 */
public class Minus implements Strategy {
    @Override
    public String execute(double a, double b) {
        String result = (a+" - "+b+" = "+ doubleDecorate(a-b));
        return result;
    }
}
