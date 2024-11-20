package kz.topmail.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTests {

    @Test
    void checkSquare() {
        double result = Square.squareOfTriangle(4.0, 5.0, 5.0);
        Assertions.assertEquals(3.0, result);
    }

}
