package calculator;

public class Decorator {
    public static void resultDecorate(String result){
        result = result.replace(".0","");
        System.out.println(result);
    }
    public static double doubleDecorate(Double dbl){
        return Math.rint(100.0 * dbl) / 100.0;
    }
}
