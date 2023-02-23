package ss6_inheritance.exercise.point_and_movablePoint;

public class PointAndMovablePointController {
    public static void main(String[] args) {
        Point point = new Point(1, 1);
        System.out.println(point);

        MovablePoint movablePoint = new MovablePoint(1, 1, 1, 1);
        movablePoint.move();
        System.out.println(movablePoint);
    }
}
