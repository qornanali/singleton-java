package shape.controller;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {

    Square square;

    @Before
    public void setUp() throws Exception {
        square = new Square();
    }

    @Test
    public void getArea() {
        square.setLength(0);
        square.setWidth(0);
        assertEquals(0, square.getArea(), 0);
    }
}