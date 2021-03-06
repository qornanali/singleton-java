package shape.controller;

import shape.BaseShape;

public class Square implements BaseShape {
    private int length = 0;
    private int width = 0;

    private static Square square;

    private Square(){
    }

    public static Square getInstance(){
        if (null == square){
            square = new Square();
        }
        return square;
    }

    public double getArea() {
        return length * width;
    }

    public void setLength(int i) {
        length = i;
    }

    public void setWidth(int i) {
        width = i;
    }
}
