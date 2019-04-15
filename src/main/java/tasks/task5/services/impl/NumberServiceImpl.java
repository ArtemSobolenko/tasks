package tasks.task5.services.impl;

import com.ibm.icu.text.RuleBasedNumberFormat;
import tasks.task1.exeptions.ArgsException;
import tasks.task5.services.NumberService;

import java.util.Locale;

public class NumberServiceImpl implements NumberService {
    private static RuleBasedNumberFormat numberFormat = new RuleBasedNumberFormat(Locale.forLanguageTag("ru"), RuleBasedNumberFormat.SPELLOUT);

    @Override
    public double getNumberFromArgs(String[] args) throws ArgsException {
        if (args.length < 1) {
            throw new ArgsException("The application is launched without parameters!\nRestart the application using the number (integer or float) as the parameter!");
        } else {
            try {
                double number = Double.parseDouble(args[0]);
                return number;
            } catch (NumberFormatException e) {
                throw new ArgsException("You must specify a number as a parameter!\nRestart the application using the number (integer or float) as the parameter!");
            }
        }
    }

    @Override
    public void printNumber(double number) {
        System.out.println(numberFormat.format(number));
    }
}
