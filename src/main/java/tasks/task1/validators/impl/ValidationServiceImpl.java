package tasks.task1.validators.impl;

import tasks.task1.exeptions.ArgsException;
import tasks.task1.validators.ValidationService;

public class ValidationServiceImpl implements ValidationService {
    @Override
    public int[] validationArgs(String[] args) throws ArgsException {
        int[] widthAndHeight = new int[2];
        if (args.length != 2) {
            throw new ArgsException("Invalid number of arguments!\nThe number of arguments must be two!");
        } else {
            if (isValidParam(args[0]) && isValidParam(args[1])) {
                widthAndHeight[0] = Integer.parseInt(args[0]);
                widthAndHeight[1] = Integer.parseInt(args[1]);
            } else {
                throw new ArgsException("The parameters can only be an integer!");
            }
        }
        return widthAndHeight;
    }

    private boolean isValidParam(String arg) {
        try {
            Integer.parseInt(arg);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
