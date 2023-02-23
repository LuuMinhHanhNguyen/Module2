package ss6_inheritance.exercise.circle_and_cylinder;

public class CircleAndCylinderController {
    public static void main(String[] args) {
        Circle circle = new Circle(2.0, "Green");
        System.out.println(circle);
        Cylinder  cylinder = new Cylinder(5.0, 2.0, "Blue");
        System.out.println(cylinder);

    }
}
