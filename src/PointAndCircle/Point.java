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
public class Point {

    private double xPosition;
    private double yPosition;

    public Point() {
        this.xPosition = 0;
        this.yPosition = 0;
    }

    public Point(double x, double y) {
        this.xPosition = x;
        this.yPosition = y;
    }

    public double getxPosition() {
        return xPosition;
    }

    public void setxPosition(double xPosition) {
        this.xPosition = xPosition;
    }

    public double getyPosition() {
        return yPosition;
    }

    public void setyPosition(double yPosition) {
        this.yPosition = yPosition;
    }

    public double[] getXY() {
        double[] result = new double[2];
        result[0] = this.xPosition;
        result[1] = this.yPosition;
        return result;
    }

    public void setXY(double x, double y) {
        this.xPosition = x;
        this.yPosition = y;
    }

    public double distance(double x, double y) {
        double xDis = this.xPosition - x;
        double yDis = this.yPosition - y;
        return Math.sqrt((xDis * xDis) + (yDis * yDis));
    }

    public double distance(Point other) {
        double xDis = this.xPosition - other.xPosition;
        double yDis = this.yPosition - other.yPosition;
        return Math.sqrt((xDis * xDis) + (yDis * yDis));
    }

    public double distance() {
        return Math.sqrt(this.xPosition * this.xPosition + this.yPosition * this.yPosition);
    }

    @Override
    public String toString() {
        return "(" + this.xPosition + " , " + this.yPosition + ")";
    }

}
