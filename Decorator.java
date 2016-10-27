package calculator;
//класс для обработки результатов вычислений, и придания им более удобного вида
public class Decorator {
    public static void resultDecorate(String result){ //убираем числа посел точки, там где они не нужны (5.0 => 5)
        result = result.replace(".0","");
        System.out.println(result);
    }
    public static double doubleDecorate(Double dbl){
        return Math.rint(100.0 * dbl) / 100.0;
    } //убираем погрешность вычислений и округляем до сотых
}
