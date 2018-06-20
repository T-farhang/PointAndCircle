/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PointAndCircle;

/**
 *
 * @author Totia
 */
public class Circle {

    private Point center;
    private double radius;

    public Circle() {
        this.center = new Point();
        this.radius = 1;
    }

    public Circle(double xCenter, double yCenter, double radius) {
        center = new Point(xCenter, yCenter);
        this.radius = radius;
    }

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCenterX() {
        return center.getxPosition();
    }

    public void setCenterX(double x) {
        center.setxPosition(x);
    }

    public double getCenterY() {
        return center.getyPosition();
    }

    public void setCenterY(double y) {
        center.setyPosition(y);
    }

    public double[] getCenterXY() {
        return center.getXY();
    }

    public void setCenterXY(double x, double y) {
        center.setXY(x, y);
    }

    @Override
    public String toString() {
        return "Circle[" + "center=" + center + ", radius=" + radius + ']';
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // It's a method that shows if two circles interrupt each other.
    public void areInterrupt(Circle other) {
        double x = this.center.distance(other.center);
        if (x / 2 <= this.radius && x / 2 <= other.radius) {
            System.out.println("They interrupt eachother.");
        } else {
            System.out.println("They don't interrupt eachother.");
        }
    }
    // It's a method that show if two circles are equal.
    public void areEqual(Circle other){
        if(this.radius == other.radius){
            System.out.println("They are equal.");
        }else
                System.out.println("They are not equal.");
    }
}
