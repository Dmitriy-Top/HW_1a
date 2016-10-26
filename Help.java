package calculator;

/**
 * Created by admin on 26.10.2016.
 */
public class Help {
    private static void showHelp(){
        System.out.println("*****************************");
        System.out.println("*Программа: Калькулятор     *");
        System.out.println("*Автор: Топольник Дмитрий   *");
        System.out.println("*****************************");
        System.out.println("Пример: java Calculator 2 * 2");
        System.out.println("x - умножение");
        System.out.println("\\ - деление");
        System.out.println("+ - сложение");
        System.out.println("- - вычитание");

    }

    public Help() {
        showHelp();
    }
    public Help(int err) {
        System.out.println("Ошибка:");
        if (err==1) System.out.println("Аргумент не являеться числом\n");
        if (err==2) System.out.println("На ноль делить нельзя\n");
        if (err==3) System.out.println("Не известный аргумент\n");
        showHelp();
    }

}
