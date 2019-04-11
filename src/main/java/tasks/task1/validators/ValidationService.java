package tasks.task1.validators;

import tasks.task1.exeptions.ArgsException;

public interface ValidationService {
    int[] validationArgs(String[] args) throws ArgsException;
}
