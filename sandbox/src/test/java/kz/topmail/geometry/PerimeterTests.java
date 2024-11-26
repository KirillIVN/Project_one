package kz.topmail.geometry;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PerimeterTests {

    @Test
    void checkTriangle() {
        Triangle triangle = new Triangle();
        double result = triangle.CalculatePerimeterTriangle(4, 5, 5);
        Assertions.assertEquals(14.0, result);
    }
}
