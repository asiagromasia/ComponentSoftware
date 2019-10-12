/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author szkola
 */
public class Circle {  
    
    double radius;  //data field
    
    /* The number of the objects created */
    static int numberOfObjects = 0;
    
    /* Construct a circle with radius 1 */
    public Circle(){
        radius=1.0;
        numberOfObjects++;
    }
    
    /* Construct a circle with a specified radius */
    public Circle(double newRadius){ 
        radius=newRadius; 
        numberOfObjects++;
    }
    /** Return numberOfObjects */
    static int getNumberOfObjects() {
        return numberOfObjects;
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


