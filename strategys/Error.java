package calculator.strategys;

import calculator.Help;

/**
 * Created by admin on 27.10.2016.
 */
public class Error implements Strategy {
    @Override
    public String execute(double a, double b) {
        new Help(3);
        return null;
    }
}
