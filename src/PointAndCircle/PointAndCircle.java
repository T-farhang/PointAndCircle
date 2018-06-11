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
public class PointAndCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1);

        Circle c2 = new Circle(3, 0, 2);
        System.err.println(c2);

        Circle c3 = new Circle(new Point(2, 1), 2);
        System.out.println(c3);
        
        Circle c4= new Circle();
        c4.setCenter(new Point(0, 0));
        c4.setRadius(2);
        System.out.println(c4);
        System.out.println("Center is " + c4.getCenter() + " and radius is " + c4.getRadius());

        c1.setCenterXY(10, 10);
        System.out.println("Center's X : " + c1.getCenterXY()[0]);
        System.out.println("Center's Y : " + c1.getCenterXY()[1]);

        System.out.printf("Area is %.2f%n" , c1.getArea());
        System.out.printf("Circumference is %.2f%n" , c1.getCircumference());
        
        c4.areInterrupt(c2);
        c2.areEqual(c3);
    }

}
