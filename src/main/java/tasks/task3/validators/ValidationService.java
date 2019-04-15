package tasks.task3.validators;

import tasks.task1.exeptions.ArgsException;

public interface ValidationService {
    String[] validationParams(String params) throws ArgsException;

    String getNameFromParams(String[] params);

    double[] getSidesFromParams(String[] params) throws ArgsException;
}
