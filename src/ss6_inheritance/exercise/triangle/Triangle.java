package ss6_inheritance.exercise.triangle;


import ss6_inheritance.practice.Shape;

public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;
    public Triangle(){

    }
    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getPerimeter(){
        return this.side1 + this.side2 + this.side3;
    }

    public double getArea(){
        double semiPerimeter = getPerimeter()/2;
        return Math.sqrt((semiPerimeter) * (semiPerimeter - this.side1) * (semiPerimeter - this.side2) * (semiPerimeter - this.side3));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "perimeter = " + this.getPerimeter() +
                ", area = " + this.getArea() +
                ", color = " + this.getColor() +
                '}';
    }
}
