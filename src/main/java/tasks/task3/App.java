package tasks.task3;

import tasks.task3.validators.impl.ValidationServiceImpl;
import tasks.task3.services.impl.TriangleServiceImpl;
import tasks.task3.view.Menu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        Menu menu = new Menu(new BufferedReader(new InputStreamReader(System.in)),
                new TriangleServiceImpl(),
                new ValidationServiceImpl());
        menu.showMenu();
    }
}
