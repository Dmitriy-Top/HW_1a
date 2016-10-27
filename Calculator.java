package calculator;
import calculator.strategys.*;
import calculator.strategys.Error;

import static calculator.Decorator.*;

 class Calculator {
    private double a; //используем тип double, так-как он дает наиболее полные возможности для
    private double b; //математических вычислений (точное деление, наибольший диапазон значений)
    private String operator;
    private String result;

    Calculator(String[] args) {
        this.operator = args[1];
        try { //парсим значения и проверяем на другие ошибки
            this.a = Double.parseDouble(args[0]);
            this.b = Double.parseDouble(args[2]);
            if (this.b == 0& operator.equals("/")) throw new ArithmeticException(); //решаем проблему double / 0 = infinity
            this.calc(); //если все нормально делаем расчет
        } catch(NumberFormatException e){
            new Help(1); //сообщаем об ошибке
        } catch (ArithmeticException e){
            new Help(2);
        }
    }
    private void calc(){
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
                strategy = new Error();
                break;
        }
        result = strategy.execute(a,b);
        if(result!=null)resultDecorate(result);
        }


    }
