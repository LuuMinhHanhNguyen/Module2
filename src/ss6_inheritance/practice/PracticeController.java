package ss6_inheritance.practice;

public class PracticeController {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.setFilled(false);
        System.out.println(shape);
        Circle circle = new Circle(2.2, "blue", true);
        System.out.println(circle);
    }

}
