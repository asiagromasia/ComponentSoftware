/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author szkola
 */
public class TestCircleWithStaticMembers {
    
    public static void main(String[] args) {
        
        System.out.println("Before creating objects");  
        System.out.println("The number of Circle objects is " + Circle.numberOfObjects);
        
        //Create c1
        Circle c1 = new Circle();
        // Display c1 BEFORE c2 is created  
        System.out.println("\nAfter creating c1");  
        System.out.println("c1: radius (" + c1.radius + ") and number of Circle objects (" +      c1.numberOfObjects + ")");
        System.out.println("The area of the circle1 of radius " + c1.radius + " is " + c1.getArea());
        
        //Create c2
        Circle c2 = new Circle(5);
       
        //Modify c1
        c1.radius=9;
        
        //Display c1and c2 AFTER c2 was created
        System.out.println("The area of the circle2 of radius " + c2.radius + " is " + c2.getArea());
        
        
        // Modify circle2 radius  
        System.out.println("\nAfter creating c2 and modifying c1");
        System.out.println("c1:radius (" + c1.radius+")and number of Circle objects (" + c1.numberOfObjects+")");
        System.out.println("c2:radius (" + c2.radius+")and number of Circle objects (" + c2.numberOfObjects+")");
        
       
    }
}

