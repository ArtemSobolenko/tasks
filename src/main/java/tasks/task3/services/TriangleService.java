package tasks.task3.services;

import tasks.task3.entity.Triangle;

import java.util.List;

public interface TriangleService {
    Triangle createTriangle(String name, double sideA, double sideB, double sideC);

    void printTriangles(List<Triangle> triangles);

    void setTriangleArea(Triangle triangle);

    List<Triangle> sortTrianglesByArea(List<Triangle> triangles);
}
