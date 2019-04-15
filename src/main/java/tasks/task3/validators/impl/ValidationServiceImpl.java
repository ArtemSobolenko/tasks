package tasks.task3.validators.impl;

import tasks.task1.exeptions.ArgsException;
import tasks.task3.validators.ValidationService;

public class ValidationServiceImpl implements ValidationService {
    @Override
    public String[] validationParams(String params) throws ArgsException {
        int requiredNumberOfArguments = 4;
        String[] args = params.split(",");
        for (int i = 1; i < args.length; i++) {
            args[i] = args[i].replaceAll("\\s+", "");
        }

        if (args.length != requiredNumberOfArguments) {
            throw new ArgsException("The number of arguments must be 4!");
        }
        return args;
    }

    @Override
    public String getNameFromParams(String[] params) {
        int firstParamForName = 0;
        return params[firstParamForName];
    }

    @Override
    public double[] getSidesFromParams(String[] params) throws ArgsException {
        double[] sides = new double[params.length - 1];
        for (int i = 0; i < sides.length; i++) {
            try {
                sides[i] = Double.parseDouble(params[i + 1]);
                if (sides[i] <= 1){
                    throw new ArgsException("The side of the triangle must be greater than 1!");
                }else {
                    //do noting
                }
            } catch (NumberFormatException e) {
                throw new ArgsException("A side can only be a number!");
            }
        }
        return sides;
    }
}
