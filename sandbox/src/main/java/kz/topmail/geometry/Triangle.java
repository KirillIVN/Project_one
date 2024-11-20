package kz.topmail.geometry;

import kz.topmail.geometry.figures.Perimeter;
import kz.topmail.geometry.figures.Square;

public class Triangle {
    public static void main(String[] args) {
        double side1 = 4.;
        double side2 = 5.;
        double side3 = 5.;

        Perimeter.PerimeterTriangle(side1, side2, side3);
        Square.SquareTriangle(side1, side2, side3);
    }

}
