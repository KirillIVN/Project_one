package kz.topmail.geometry;

import kz.topmail.geometry.figues.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTests {

    @Test
    void checkSquare() {
        Triangle triangle = new Triangle(4., 5., 5.);
        double result = triangle.square();
        Assertions.assertEquals(3.0, result);
    }

}
