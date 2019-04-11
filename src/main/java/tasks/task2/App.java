package tasks.task2;

import tasks.task2.services.impl.CoverServiceImpl;
import tasks.task2.view.Menu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        Menu menu = new Menu(new BufferedReader(new InputStreamReader(System.in)), new CoverServiceImpl());
        menu.showMenu();
    }
}
