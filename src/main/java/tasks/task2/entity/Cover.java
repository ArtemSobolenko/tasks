package tasks.task2.entity;

public class Cover {
    private int id;
    private double width;
    private double height;

    public Cover(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cover{" +
                "id=" + id +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
