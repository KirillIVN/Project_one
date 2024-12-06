package kz.topmail.geometry;

import kz.topmail.geometry.figues.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EqualsTests {
    @Test
    void checkTriangleEquality() {
        Triangle triangle = new Triangle(4., 5., 5.);
        Triangle triangle1 = new Triangle(5., 5., 4.);
        Assertions.assertEquals(triangle, triangle1);
    }
}
