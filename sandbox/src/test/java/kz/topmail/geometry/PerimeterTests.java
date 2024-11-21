package kz.topmail.geometry;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PerimeterTests {

    @Test
    void checkSquare() {
        double result = Triangle.perimeterOfTriangle(4.0, 5.0, 5.0);
        Assertions.assertEquals(14.0, result);
    }
}
