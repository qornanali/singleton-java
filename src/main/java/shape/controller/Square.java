package shape.controller;

import shape.BaseShape;

public class Square implements BaseShape {
    private double area = 0;

    public double getArea() {
        return area;
    }

    public void setLength(int i) {
        area = i;
    }

    public void setWidth(int i) {
        area = i;
    }
}
