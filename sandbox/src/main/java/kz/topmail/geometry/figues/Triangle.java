package kz.topmail.geometry.figues;

public class Triangle {

    double side1;
    double side2;
    double side3;


    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    //Perimeter calculation
    public static void CalculatePerimeterTriangle(Triangle triangle) {
        System.out.println("Perimeter of Triangle = " + triangle.perimeter());
    }

    public double perimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    //Square calculation
    public static void CalculateSquareTriangle(Triangle triangle) {
        System.out.println("Square of Triangle = " + triangle.square());
    }

    public double square() {
        double halfSquare = (this.side1 + this.side2 + this.side3) / 2;
        return Math.round(Math.sqrt((halfSquare - this.side1) * (halfSquare - this.side2) * (halfSquare - this.side3)));
    }
}
