package kz.topmail.geometry;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTests {

    @Test
    void checkSquare() {
        Triangle triangle = new Triangle();
        double result = triangle.CalculateSquareTriangle(4, 5, 5);
        Assertions.assertEquals(3.0, result);
    }

}
