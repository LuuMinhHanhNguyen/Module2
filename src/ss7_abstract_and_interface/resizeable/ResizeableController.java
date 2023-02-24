package ss7_abstract_and_interface.resizeable;


import ss7_abstract_and_interface.practice.Circle;
import ss7_abstract_and_interface.practice.Rectangle;
import ss7_abstract_and_interface.practice.Shape;
import ss7_abstract_and_interface.practice.Square;

public class ResizeableController {
    public static void main(String[] args) {
        Circle circle = new Circle(1.0);

        Rectangle rectangle = new Rectangle(2.0, 3.0);

        Square square = new Square(3);

        Shape[] shapes = new Shape[]{circle, rectangle, square};

        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                System.out.println("Area of Circle before resizing: " + shape.getArea());
            }
            if (shape instanceof Rectangle) {
                System.out.println("Are of Rectangle before resizing: " + shape.getArea());
            }
            if (shape instanceof Square) {
                System.out.println("Are of Square before resizing: " + shape.getArea());
            }
        }


        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                double random = 1 + Math.round(Math.random() * 100);
                System.out.println("Increase radius by " + random + " %");
                ((Circle) shape).resize(random);
                System.out.println("Area of Circle after resizing: " + shape.getArea());
            }
            if (shape instanceof Rectangle) {
                double random = 1 + Math.round(Math.random() * 100);
                System.out.println("Increase width and height by " + random + " %");
                ((Rectangle) shape).resize(random);
                System.out.println("Area of Rectangle after resizing: " + shape.getArea());
            }
            if (shape instanceof Square) {
                double random = 1 + Math.round(Math.random() * 100);
                System.out.println("Increase each side by " + random + " %");
                ((Square) shape).resize(random);
                System.out.println("Area of Square after resizing: " + shape.getArea());
            }
        }


    }
}

