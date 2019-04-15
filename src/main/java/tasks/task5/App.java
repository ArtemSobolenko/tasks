package tasks.task5;

import tasks.task1.exeptions.ArgsException;
import tasks.task5.services.NumberService;
import tasks.task5.services.impl.NumberServiceImpl;

public class App {
    private static NumberService numberService = new NumberServiceImpl();

    public static void main(String[] args) {
        double number;
        try {
            number = numberService.getNumberFromArgs(args);
            numberService.printNumber(number);
        } catch (ArgsException e) {
            e.printStackTrace();
        }
    }
}
