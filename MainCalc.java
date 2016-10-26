package calculator;

public class MainCalc {
    public static void main(String[] args) {
        if (args.length==3){
        new Calculator(args);
        }
        else {
            new Help();
        }
    }
}
