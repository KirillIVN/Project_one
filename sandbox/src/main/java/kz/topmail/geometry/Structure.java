package kz.topmail.geometry;

import kz.topmail.geometry.figues.Triangle;

public class Structure {

    public static void main(String[] args) {
        Triangle.CalculatePerimeterTriangle(new Triangle(4., 5., -5.));
        Triangle.CalculateSquareTriangle(new Triangle(4.0, -5.0, 5.0));
    }
}

