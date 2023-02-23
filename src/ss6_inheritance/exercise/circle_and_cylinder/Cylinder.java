package ss6_inheritance.exercise.circle_and_cylinder;

public class Cylinder extends Circle{
    private double height;

    Cylinder(double height, double radius, String color){
        super(radius, color);
        this.height = height;
    }

    public double getVolume(){
        return this.height * this.getArea();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", area=" + getArea() +
                ", color=" + getColor() +
                ", volume=" + getVolume() +
                '}';
    }
}
