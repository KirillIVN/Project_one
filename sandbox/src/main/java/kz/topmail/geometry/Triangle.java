package kz.topmail.geometry;

public class Triangle {

    private double side1;
    private double side2;
    private double side3;

    //Perimeter calculation
    double CalculatePerimeterTriangle(double a, double b, double c) {
        double perimeter = a + b + c;
        System.out.println("Perimeter of Triangle = " + perimeter);
        return perimeter;
    }

    //Square calculation
    double CalculateSquareTriangle(double d, double e, double f) {
        double halfSquare = (d + e + f) / 2;
        double Square = Math.round(Math.sqrt((halfSquare - d) * (halfSquare - e) * (halfSquare - f)));
        System.out.println("Square of Triangle = " + Square);
        return Square;
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.side1 = 4.0;
        triangle.side2 = 5.0;
        triangle.side3 = 5.0;


        triangle.CalculatePerimeterTriangle(triangle.side1,triangle.side2, triangle.side3);
        triangle.CalculateSquareTriangle(triangle.side1, triangle.side2, triangle.side3);
    }

}

