package calculator;
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
        switch (operator){
            case "+":
                result = (a+" + "+b+" = "+ doubleDecorate(a+b));
                resultDecorate(result);
                break;
            case "-":
                result = (a+" - "+b+" = "+ doubleDecorate(a-b));
                resultDecorate(result);
                break;
            case "x":
                result = (a+" x "+b+" = "+ doubleDecorate(a*b));
                resultDecorate(result);
                break;
            case "/":
                result = (a+" / "+b+" = "+ doubleDecorate(a/b));
                resultDecorate(result);
                break;
            default: new Help(3);
                break;
        }
        }

    }
