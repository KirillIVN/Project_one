package kz.topmail.geometry.figures;

import java.text.DecimalFormat;

public class Square {
    public static void SquareTriangle(double d, double e, double f) {
                System.out.println("Square of Triangle = " + squareOfTriangle(d, e, f));
    }

    public static double squareOfTriangle(double d, double e, double f) {
        double halfSquare = (d + e + f) / 2;
        return Math.round(Math.sqrt((halfSquare - d) * (halfSquare - e) * (halfSquare - f)));
    }
}
