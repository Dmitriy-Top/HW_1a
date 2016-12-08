package calculator;
import calculator.Exception.ArgumentsParseException;
import calculator.Exception.ArithmeticOperationsException;
import calculator.Exception.CalcException;
import calculator.Exception.DivisionByZero;
import calculator.strategys.*;
import calculator.strategys.Error;

import static calculator.Decorator.*;

 class Calculator {
    private double a; //используем тип double, так-как он дает наиболее полные возможности для
    private double b; //математических вычислений (точное деление, наибольший диапазон значений)
    private String operator;
    private String result;

    Calculator(String[] args) throws CalcException {
        this.operator = args[1];
        try { //парсим значения и проверяем на другие ошибки
            this.a = Double.parseDouble(args[0]);
            this.b = Double.parseDouble(args[2]);
            if (this.b == 0& operator.equals("/")) throw new ArithmeticException(); //решаем проблему double / 0 = infinity
            this.calc(); //если все нормально делаем расчет
        } catch(NumberFormatException e){
            throw new ArgumentsParseException();
        } catch (ArithmeticException e){
            throw new DivisionByZero();
        }
    }
    private void calc() throws CalcException {
        Strategy strategy;
        switch (operator){
            case "+":
                strategy = new Plus();
                break;
            case "-":
                strategy = new Minus();
                break;
            case "x":
                strategy = new Multiplication();
                break;
            case "/":
                strategy = new Division();
                break;
            default:
                throw new ArithmeticOperationsException();
        }
        result = strategy.execute(a,b);
        if(result!=null){
            resultDecorate(result);
        } else{
            throw new CalcException();
        }
        }


    }
