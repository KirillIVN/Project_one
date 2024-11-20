package kz.topmail.geometry.figures;

public class Perimeter {
      public static void PerimeterTriangle(double a, double b, double c) {
        System.out.println("Perimeter of Triangle = " + perimeterOfTriangle(a, b, c));
    }

    public static double perimeterOfTriangle(double a, double b, double c) {
        return a + b + c;
    }
}
