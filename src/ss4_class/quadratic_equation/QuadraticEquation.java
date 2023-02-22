package ss4_class.quadratic_equation;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        return (this.b * this.b) - (4 * this.a * this.c);
    }

    public void getRoot1() {
        if (getDiscriminant() < 0) {
            System.out.println("There is no root for this equation!");
        } else if (getDiscriminant() == 0) {
            System.out.println("The equation has one root r = " + ((-this.b) / 2 * this.a));
        } else {
            System.out.println("The first root is: " + ((-this.b + Math.sqrt(getDiscriminant())) / 2 * this.a));
        }
    }

    public void getRoot2() {
        if (getDiscriminant() < 0) {
            System.out.println("There is no root for this equation!");
        } else if (getDiscriminant() == 0) {
            System.out.println("The equation has one root r = " + ((-this.b) / 2 * this.a));
        } else {
            System.out.println("The first root is: " + ((-this.b - Math.sqrt(getDiscriminant())) / 2 * this.a));
        }
    }

}


