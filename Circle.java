/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testcircle;

/**
 *
 * @author szkola
 */

// Define the circle class with two constructors
public class Circle {
    
    double radius;  //data field
    
    /** Construct a circle with radius 1 */
    public Circle(){
        radius=1;
    }
    
    /** Construct a circle with a specified radius */
    public Circle(double newRadius){ 
        radius=newRadius; 
    }
    
    /** Return the area of this circle */
    public double getArea(){  
        return radius*radius*Math.PI;
    }
    /** Return the perimeter of this circle */
    public double getPerimeter() { 
        return 2 * radius * Math.PI; 
    }
    
    /** Set a new radius for this circle */
    public void setRadius(double newRadius){ 
        radius = newRadius;
    }
    
}
