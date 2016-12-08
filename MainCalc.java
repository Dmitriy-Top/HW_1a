package calculator;

import calculator.Exception.ArgumentsParseException;
import calculator.Exception.ArithmeticOperationsException;
import calculator.Exception.CalcException;
import calculator.Exception.DivisionByZero;

public class MainCalc {
    public static void main(String[] args) {
        if (args.length == 3) {
            try {
                try {
                    try {
                        try {
                            new Calculator(args); //базовая проверка кол-ва аргументов и уходим из main
                        } catch (DivisionByZero err) {
                            err.printStackTrace();
                        }
                    } catch (ArgumentsParseException err) {
                        err.printStackTrace();
                    }
                } catch (ArithmeticOperationsException err) {
                    err.printStackTrace();
                }
            } catch (CalcException err){
                err.printStackTrace();
            }
        } else {
            new Help();
        }
    }

}
