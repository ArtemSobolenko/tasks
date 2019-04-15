package tasks.task3.view;


import tasks.task1.exeptions.ArgsException;
import tasks.task3.entity.Triangle;
import tasks.task3.services.TriangleService;
import tasks.task3.validators.ValidationService;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Menu {
    private final BufferedReader BUFFERED_READER;
    private final TriangleService TRIANGLE_SERVICE;
    private final ValidationService VALIDATION_SERVICE;

    public Menu(BufferedReader BUFFERED_READER, TriangleService TRIANGLE_SERVICE, ValidationService VALIDATION_SERVICE) {
        this.BUFFERED_READER = BUFFERED_READER;
        this.TRIANGLE_SERVICE = TRIANGLE_SERVICE;
        this.VALIDATION_SERVICE = VALIDATION_SERVICE;
    }

    public void showMenu() throws IOException {
        List<Triangle> triangles = new ArrayList<>();
        String[] params;
        do {
            System.out.println("Enter the parameters of the triangle in the form: <name>, <side length>, <side length>, <side length>\n");
            try {
                params = VALIDATION_SERVICE.validationParams(BUFFERED_READER.readLine());
                double[] sides = VALIDATION_SERVICE.getSidesFromParams(params);
                Triangle triangle = TRIANGLE_SERVICE.createTriangle(VALIDATION_SERVICE.getNameFromParams(params), sides[0], sides[1], sides[2]);
                TRIANGLE_SERVICE.setTriangleArea(triangle);
                triangles.add(triangle);
            } catch (ArgsException e) {
                e.printStackTrace();
            }
        } while (isRun());
        TRIANGLE_SERVICE.sortTrianglesByArea(triangles);
        TRIANGLE_SERVICE.printTriangles(triangles);
    }

    private boolean isRun() throws IOException {
        String answer;
        boolean run;
        System.out.println("Do you want to continue...?\n\"y\"/\"yes\"\n");
        answer = BUFFERED_READER.readLine().toLowerCase();
        if (answer.equals("y") || answer.equals("yes")) {
            run = true;
        } else {
            run = false;
        }
        return run;
    }
}
