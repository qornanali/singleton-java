package shape.controller;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {

    Square square;
    Square otherSquare;

    @Before
    public void setUp() {
        square = Square.getInstance();
        otherSquare = Square.getInstance();
    }

    @Test
    public void getAreaShouldReturn0WhenLength0AndWidth0Test() {
        square.setLength(0);
        square.setWidth(0);
        assertEquals(0, square.getArea(), 0);
    }


    @Test
    public void getAreaShouldReturn1WhenLength1AndWidth1Test() {
        square.setLength(1);
        square.setWidth(1);
        assertEquals(1, square.getArea(), 0);
    }

    @Test
    public void getAreaShouldReturn4WhenLength2AndWidth2Test() {
        square.setLength(2);
        square.setWidth(2);
        assertEquals(4, square.getArea(), 0);
    }

    @Test
    public void getAreaShouldReturn2WhenLength2AndWidth1Test() {
        square.setLength(2);
        square.setWidth(1);
        assertEquals(2, square.getArea(), 0);
    }

    @Test
    public void squareInstanceShouldBeEqualsWithOtherSquareInstanceTest(){
        assertEquals(square, otherSquare);
    }
}