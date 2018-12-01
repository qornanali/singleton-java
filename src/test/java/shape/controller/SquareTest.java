package shape.controller;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {

    Square square;

    @Before
    public void setUp() {
        square = new Square();
    }

    @Test
    public void getAreaShouldReturn0WhenLength0AndWidth0Teststa() {
        square.setLength(0);
        square.setWidth(0);
        assertEquals(0, square.getArea(), 0);
    }


    @Test
    public void getAreaShouldReturn1WhenLength1AndWidth1Teststa() {
        square.setLength(1);
        square.setWidth(1);
        assertEquals(1, square.getArea(), 0);
    }
}