package kz.topmail.geometry;

public class Triangle {
    public static void main(String[] args) {
        double side1 = 4.;
        double side2 = 5.;
        double side3 = 5.;

        PerimeterTriangle(side1, side2, side3);
        SquareTriangle(side1, side2, side3);

    }

//Perimeter calculation
      public static void PerimeterTriangle(double a, double b, double c) {
        System.out.println("Perimeter of Triangle = " + perimeterOfTriangle(a, b, c));
    }

    public static double perimeterOfTriangle(double a, double b, double c) {
        return a + b + c;
    }

//Square calculation
    public static void SquareTriangle(double d, double e, double f) {
                System.out.println("Square of Triangle = " + squareOfTriangle(d, e, f));
    }

    public static double squareOfTriangle(double d, double e, double f) {
        double halfSquare = (d + e + f) / 2;
        return Math.round(Math.sqrt((halfSquare - d) * (halfSquare - e) * (halfSquare - f)));
    }
}

