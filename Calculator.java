package calculator;
import static calculator.Decorator.*;

 class Calculator {
    private double a;
    private double b;
    private String operator;
    private String result;

    Calculator(String[] args) {
        this.operator = args[1];
        try {
            this.a = Double.parseDouble(args[0]);
            this.b = Double.parseDouble(args[2]);
            if (this.b == 0& operator.equals("/")) throw new ArithmeticException();
            this.calc();
        } catch(NumberFormatException e){
            new Help(1);
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
