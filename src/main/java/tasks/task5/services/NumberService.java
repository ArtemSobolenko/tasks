package tasks.task5.services;

import tasks.task1.exeptions.ArgsException;

public interface NumberService {
    double getNumberFromArgs(String[] args) throws ArgsException;

    void printNumber(double number);
}
