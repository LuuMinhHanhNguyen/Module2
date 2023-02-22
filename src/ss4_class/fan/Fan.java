package ss4_class.fan;

public class Fan {

    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    private int speed = this.SLOW;
    private boolean on = false;
    private double radius = 5.0;
    private String color = "blue";

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int newSpeed) {
        this.speed = newSpeed;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(int newRadius) {
        this.radius = newRadius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }

    public void turnOn() {
        this.on = true;
    }

    public void turnOff() {
        this.on = false;
    }

    public String toString() {
        if (this.on) {
            return "Fan is ON with speed " + this.speed + ", color " + this.color + ", and radius " + this.radius;
        } else {
            return "Fan is OFF with color " + this.color + " and radius " + this.radius;
        }
    }

}
