/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author szkola
 */
public class TestCircleWithPrivateDataField {
    /** Main method */ 
    public static void main(String[] args) {
        
// Create a Circle with radius 5.0
    Circle myCircle = new Circle (5.0);    
    System.out.println("The area of the circle of radius "      + myCircle.getRadius() + " is " + myCircle.getArea());
// Increase myCircle's radius by 10%
    myCircle.setRadius(myCircle.getRadius() * 1.1); 
    System.out.println("The area of the circle of radius "      + myCircle.getRadius() + " is " + myCircle.getArea()); 
}
}
