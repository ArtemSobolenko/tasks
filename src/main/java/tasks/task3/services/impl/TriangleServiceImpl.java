package tasks.task3.services.impl;

import tasks.task3.entity.Triangle;
import tasks.task3.services.TriangleService;

import java.util.Collections;
import java.util.List;

public class TriangleServiceImpl implements TriangleService {
    @Override
    public Triangle createTriangle(String name, double sideA, double sideB, double sideC) {
        return new Triangle(name, sideA, sideB, sideC);
    }

    @Override
    public void setTriangleArea(Triangle triangle) {
        double halfPerimeter = (triangle.getSideA() + triangle.getSideB() + triangle.getSideC()) / 2;
        double area = Math.sqrt(halfPerimeter * (halfPerimeter - triangle.getSideA()) * (halfPerimeter - triangle.getSideB()) * (halfPerimeter - triangle.getSideC()));
        triangle.setArea(area);
    }

    @Override
    public List<Triangle> sortTrianglesByArea(List<Triangle> triangles) {
        Collections.sort(triangles);
        return triangles;
    }

    @Override
    public void printTriangles(List<Triangle> triangles) {
        if (triangles.size() == 0) {
            System.out.println("Triangles not found!");
        } else {
            System.out.println("============= Triangles list: ===============");
            for (Triangle triangle : triangles) {
                System.out.println(triangle.toString());
            }
        }
    }
}
